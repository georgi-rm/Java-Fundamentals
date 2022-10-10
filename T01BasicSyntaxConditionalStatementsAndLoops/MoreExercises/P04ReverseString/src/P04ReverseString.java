import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        StringBuilder reversedText = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedText.append(inputString.charAt(i));
        }

        System.out.println(reversedText);
    }
}
