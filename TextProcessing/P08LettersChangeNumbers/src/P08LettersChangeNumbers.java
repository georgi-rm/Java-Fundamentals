import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double total = 0;

        for (int i = 0; i < input.length; i++) {
            char symbolBefore = input[i].charAt(0);
            char symbolAfter = input[i].charAt(input[i].length() - 1);
            double number = Double.parseDouble(input[i].substring(1, input[i].length() - 1));

            double result = 0;

            if (Character.isUpperCase(symbolBefore)) {
                result = number / (symbolBefore - 'A' + 1);
            } else if (Character.isLowerCase(symbolBefore)) {
                result = number * (symbolBefore - 'a' + 1);
            }

            if (Character.isUpperCase(symbolAfter)) {
                result -= symbolAfter - 'A' + 1;
            } else if (Character.isLowerCase(symbolAfter)) {
                result += symbolAfter - 'a' + 1;
            }
            total += result;
        }
        System.out.printf("%.2f", total);

    }
}
