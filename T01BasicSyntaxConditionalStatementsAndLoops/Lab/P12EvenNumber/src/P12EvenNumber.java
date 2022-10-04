import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Math.abs(Integer.parseInt(scanner.nextLine()));

            if (number % 2 == 0) {
                System.out.printf("The number is: %d", number);
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
