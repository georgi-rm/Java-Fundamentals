import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int currentMinimum = getMinimumNumber(number1,number2);

        System.out.println(getMinimumNumber(currentMinimum,number3));

    }

    private static int getMinimumNumber(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
