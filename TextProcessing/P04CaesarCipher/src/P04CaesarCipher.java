import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            symbol += 3;

            output.append(symbol);
        }
        System.out.println(output);
    }
}
