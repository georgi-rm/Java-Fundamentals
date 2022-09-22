import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoIntegers(number1, number2);
        sum = subtractTwoIntegers(sum, number3);
        System.out.println(sum);
    }

    private static int sumTwoIntegers(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtractTwoIntegers(int number1, int number2) {
        return number1 - number2;
    }
}
