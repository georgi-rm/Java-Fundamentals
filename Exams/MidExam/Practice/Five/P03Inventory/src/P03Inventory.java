import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "Collect":
                    if(!inventory.contains(command[1])) {
                        inventory.add(command[1]);
                    }
                    break;
                case "Drop":
                    inventory.remove(command[1]);
                    break;
                case "Combine Items":
                    String[] items = command[1].split(":");
                    if (inventory.contains(items[0])) {
                        int indexOfOldItem = findIndexOfItem(items[0], inventory);
                        if (indexOfOldItem >= 0) {
                            inventory.add(indexOfOldItem + 1, items[1]);
                        }
                    }
                    break;
                case "Renew":
                    if (inventory.contains(command[1])) {
                        inventory.remove(command[1]);
                        inventory.add(command[1]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < inventory.size();i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.printf("%s", inventory.get(i));
        }
    }
    private static int findIndexOfItem(String item, List<String> inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            if (item.equals(inventory.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
