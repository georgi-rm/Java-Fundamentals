import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 8; i <= number ; i++) {
            if (isTopNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isTopNumber(int number) {
        if (!isSumOfDigitsDivisibleBy8(number)) {
            return false;
        }

        return doesContainsOddDigit(number);
    }

    private static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean doesContainsOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            if (digit % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
