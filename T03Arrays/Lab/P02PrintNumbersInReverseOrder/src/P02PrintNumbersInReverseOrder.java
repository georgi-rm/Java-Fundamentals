import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int[countOfNumbers];

        for (int i = countOfNumbers - 1; i >= 0; i--) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < countOfNumbers; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
