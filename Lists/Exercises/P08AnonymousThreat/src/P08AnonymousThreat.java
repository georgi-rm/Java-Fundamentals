import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "merge":
                    mergeList(strings, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "divide":
                    divideList(strings, Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
            }
            input = scanner.nextLine();
        }
        for (String element:strings) {
            System.out.printf("%s ", element);
        }
    }

    private static void mergeList(List<String> list, int startIndex, int endIndex) {
        if (startIndex < 0) {
            startIndex = 0;
        }

        if (endIndex >= list.size()) {
            endIndex = list.size() - 1;
        }

        for (int i = endIndex; i > startIndex ; i--) {
            list.set(i - 1, list.get(i-1) + list.get(i));
            list.remove(i);
        }
    }


    private static void divideList(List<String> list, int index, int partitions) {
        if (index < 0 || index >= list.size()) {
            return;
        }
        String elementToSplit = list.get(index);
        List<String> listFromElementToSplit = new ArrayList<>();

        for (int i = 0; i < elementToSplit.length(); i++) {
            listFromElementToSplit.add("" + elementToSplit.charAt(i));
        }

        int partitionSize = elementToSplit.length() / partitions;
        int lastPartitionSize = partitionSize + elementToSplit.length() % partitions;
        StringBuilder tempElement = new StringBuilder();

        for (int i = 0; i < lastPartitionSize; i++) {
            tempElement.insert(0, listFromElementToSplit.get(listFromElementToSplit.size() - 1));
            listFromElementToSplit.remove(listFromElementToSplit.size() - 1);
        }
        list.set(index, tempElement.toString());

        tempElement.setLength(0);
        int j = 0;
        while (listFromElementToSplit.size() > 0) {
            tempElement.insert(0, listFromElementToSplit.get(listFromElementToSplit.size() - 1));
            listFromElementToSplit.remove(listFromElementToSplit.size() - 1);
            j++;
            if (j >= partitionSize) {
                list.add(index, tempElement.toString());
                tempElement.setLength(0);
                j = 0;
            }
        }

    }
}
