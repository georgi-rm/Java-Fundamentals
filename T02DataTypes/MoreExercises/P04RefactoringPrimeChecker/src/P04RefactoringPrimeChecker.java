import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= maxNumber; number++) {
            boolean isPrime = true;

            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}
