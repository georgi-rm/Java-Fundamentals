import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStrings = Integer.parseInt(scanner.nextLine());

        int[] encrypted = new int[countOfStrings];
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < countOfStrings; i++) {
            String text = scanner.nextLine();

            for (int j = 0; j < text.length(); j++) {
                char symbol = text.charAt(j);

                if (vowels.contains(String.valueOf(symbol))) {
                    encrypted[i] += symbol * text.length();
                } else {
                    encrypted[i] += symbol / text.length();
                }
            }
        }

        int[] encryptedAndSorted = Arrays.stream(encrypted)
                .sorted()
                .toArray();

        for (int j : encryptedAndSorted) {
            System.out.println(j);
        }
    }
}
