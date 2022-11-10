import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String sign = "positive";

        if (number == 0) {
            sign = "zero";
        } else if (number < 0) {
            sign = "negative";
        }

        System.out.printf("The number %d is %s.", number, sign);
    }
}
