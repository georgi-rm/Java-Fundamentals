import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double difference = Math.abs(firstNumber - secondNumber);

        if (difference >= 0.000001) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
