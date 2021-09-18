import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            printMultipleNumberLine(number);
        }
    }

    private static void printMultipleNumberLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }
}
