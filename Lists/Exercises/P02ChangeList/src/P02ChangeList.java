import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Delete":
                    while (myList.contains(command[1])) {
                        myList.remove(command[1]);
                    }
                    break;
                case "Insert":
                    myList.add(Integer.parseInt(command[2]), command[1]);
                    break;
            }
            input = scanner.nextLine();
        }

        for (String element: myList) {
            System.out.printf("%s ", element);
        }
    }
}
