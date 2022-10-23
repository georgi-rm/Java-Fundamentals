import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            int numberOfLeftDigits = currentNumber;

            int sumOfDigits = 0;

            while (numberOfLeftDigits > 0) {
                sumOfDigits += numberOfLeftDigits % 10;
                numberOfLeftDigits = numberOfLeftDigits / 10;
            }

            boolean isSpecialNum = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);

            String isSpecialString = isSpecialNum ? "True" : "False";

            System.out.printf("%d -> %s%n", currentNumber, isSpecialString);
        }
    }
}
