import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            int numberOfLeftDigits = number;

            int sum = 0;
            while (numberOfLeftDigits > 0) {
                sum += numberOfLeftDigits % 10;
                numberOfLeftDigits /= 10;
            }

            String isSpecialAsString = "False";
            if (sum == 5 || sum == 7 || sum == 11) {
                isSpecialAsString = "True";
            }

            System.out.printf("%d -> %s%n", number, isSpecialAsString);
        }
    }
}
