import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            int index = 0;
            switch (command[0]) {
                case "Add":
                    numbers.add(command[1]);
                    break;
                case "Insert":
                    index = Integer.parseInt(command[2]);
                    if (index < 0 || index > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, command[1]);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(command[1]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                        if (numbers.size() > 1) {
                            if (command[1].equals("left")) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            } else {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (String number:numbers) {
            System.out.printf("%s ", number);
        }
    }
}
