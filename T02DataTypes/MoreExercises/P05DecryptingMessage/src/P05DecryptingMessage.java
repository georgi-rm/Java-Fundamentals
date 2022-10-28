import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int countOfLines = Integer.parseInt(scanner.nextLine());

        StringBuilder output = new StringBuilder();

        for (int line = 0; line < countOfLines; line++) {
            output.append(String.format("%c", scanner.nextLine().charAt(0) + key));
        }

        System.out.println(output);
    }
}
