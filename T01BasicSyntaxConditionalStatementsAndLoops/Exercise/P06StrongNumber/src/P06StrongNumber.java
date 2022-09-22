import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int tempNumber = number;
        int sum = 0;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            tempNumber /= 10;
            int factorial = 1;
            for (int i = 1; i <= digit ; i++) {
                factorial *= i;
            }
            sum += factorial;
        }
        if (sum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
