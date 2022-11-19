import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstOperand = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondOperand = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(firstOperand, operator, secondOperand));

    }

    public static int calculate(int firstOperand, String operator, int secondOperand) {
        int result = 0;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            default:
                break;
        }

        return result;
    }
}
