import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int fistOperand = Integer.parseInt(scanner.nextLine());
        int secondOperand = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                add(fistOperand, secondOperand);
                break;
            case "subtract":
                subtract(fistOperand, secondOperand);
                break;
            case "divide":
                divide(fistOperand, secondOperand);
                break;
            case "multiply":
                multiply(fistOperand, secondOperand);
                break;
            default:
                break;
        }
    }

    public static void add(int fistOperand, int secondOperand) {
        System.out.println(fistOperand + secondOperand);
    }

    public static void subtract(int fistOperand, int secondOperand) {
        System.out.println(fistOperand - secondOperand);
    }

    public static void divide(int fistOperand, int secondOperand) {
        System.out.println(fistOperand / secondOperand);
    }

    public static void multiply(int fistOperand, int secondOperand) {
        System.out.println(fistOperand * secondOperand);
    }
}
