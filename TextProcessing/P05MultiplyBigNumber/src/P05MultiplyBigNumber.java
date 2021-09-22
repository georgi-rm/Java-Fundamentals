import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstMultiplier = scanner.nextLine();
        int secondMultiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < firstMultiplier.length(); i++) {
            if (firstMultiplier.charAt(i) != '0') {
                firstMultiplier = firstMultiplier.substring(i);
                break;
            }
        }

        if (secondMultiplier == 0) {
            resultString.insert(0, 0);
        } else {
            int inMind = 0;
            for (int i = firstMultiplier.length() - 1; i >= 0; i--) {
//                int currentDigit = Integer.parseInt(firstMultiplier.substring(i, i + 1));
                int currentDigit = firstMultiplier.charAt(i) - '0';
                int resultOfMultiplication = currentDigit * secondMultiplier + inMind;

                resultString.insert(0, resultOfMultiplication % 10);
                inMind = resultOfMultiplication / 10;
            }

            if (inMind > 0) {
                resultString.insert(0, inMind);
            }
        }
        System.out.println(resultString);
    }
}
