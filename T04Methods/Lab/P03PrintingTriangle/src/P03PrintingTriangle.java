import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size; i++) {
            printLine(i);
        }

        for (int i = size - 1; i > 0; i--) {
            printLine(i);
        }
    }

    public static void printLine(int end) {

        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
