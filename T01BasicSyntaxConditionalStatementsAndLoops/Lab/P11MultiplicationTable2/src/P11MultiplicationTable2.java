import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= Math.max(10, startNumber); i++) {
            System.out.printf("%d X %d = %d%n", number, i, number * i);
        }
    }
}
