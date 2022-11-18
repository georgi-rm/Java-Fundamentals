import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(number));

    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int sumOfEven = getEvenSum(n);
        int sumOfOdd = getOddSum(n);

        return sumOfEven * sumOfOdd;
    }

    public static int getEvenSum(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            n /= 10;
        }

        return sum;
    }

    public static int getOddSum(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }

            n /= 10;
        }

        return sum;
    }
}
