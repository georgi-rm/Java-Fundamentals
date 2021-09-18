import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double firstFactorial = calculateFactorial(firstNumber);
        double secondFactorial = calculateFactorial(secondNumber);

        System.out.printf("%.02f", firstFactorial / secondFactorial);
    }

    private static double calculateFactorial(int number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
