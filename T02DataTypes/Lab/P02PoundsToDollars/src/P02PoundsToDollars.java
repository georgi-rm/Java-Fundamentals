import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double EXCHANGE_RATE_POUNDS_TO_DOLLARS = 1.36;

        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * EXCHANGE_RATE_POUNDS_TO_DOLLARS;

        System.out.printf("%.3f", dollars);
    }
}
