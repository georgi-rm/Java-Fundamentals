import java.math.BigInteger;
import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLinesToRead = Integer.parseInt(scanner.nextLine());

        for (int line = 0; line < numberOfLinesToRead; line++) {
            String[] lineData = scanner.nextLine().split(" ");

            BigInteger firstNumber = new BigInteger(lineData[0]);
            BigInteger secondNumber = new BigInteger(lineData[1]);

            if (firstNumber.compareTo(secondNumber) > 0) {
                System.out.println(calculateSumOfDigits(firstNumber));
            } else {
                System.out.println(calculateSumOfDigits(secondNumber));
            }
        }
    }

    public static int calculateSumOfDigits(BigInteger number) {
        int sum = 0;

        String numberAsString = number.toString();

        for (int i = 0; i < numberAsString.length(); i++) {
            char symbol = numberAsString.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                sum += Integer.parseInt(String.valueOf(symbol));
            }
        }

        return sum;
    }
}
