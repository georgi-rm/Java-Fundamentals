import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();

        String symbolToLower = symbol.toLowerCase();

        if (symbol.equals(symbolToLower)) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
