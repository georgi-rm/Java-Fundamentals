import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        char lastWrittenChar = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (i == 0 || lastWrittenChar != currentChar) {
                output.append(currentChar);
                lastWrittenChar = currentChar;
            }
        }
        System.out.println(output);
    }
}
