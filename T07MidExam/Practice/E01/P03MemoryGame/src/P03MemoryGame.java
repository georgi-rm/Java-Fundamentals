import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int numberOfMoves = 1;
        while (!input.equals("end")) {
            String[] enteredIndexes = input.split("\\s+");

            int firstIndex = Integer.parseInt(enteredIndexes[0]);
            int secondIndex = Integer.parseInt(enteredIndexes[1]);

            if ((firstIndex == secondIndex) || isIndexOutOfBounds(firstIndex, elements) || isIndexOutOfBounds(secondIndex, elements)) {
                String elementToAdd = "-" + numberOfMoves + "a";
                elements.add(elements.size() / 2, elementToAdd);
                elements.add(elements.size() / 2, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = elements.get(firstIndex);
                if (firstElement.equals(elements.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(firstIndex));
                    elements.remove(firstElement);
                    elements.remove(firstElement);
                } else {
                    System.out.println("Try again!");
                }
            }

            if (elements.isEmpty()) {
                break;
            }

            input = scanner.nextLine();
            numberOfMoves++;
        }

        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!", numberOfMoves);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }
    }

    private static boolean isIndexOutOfBounds(int index, List<String> list) {
        return index < 0 || index >= list.size();
    }

}
