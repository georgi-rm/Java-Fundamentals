import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfLines = Integer.parseInt(scanner.nextLine());


        StringBuilder output = new StringBuilder();

        for (int i = 0; i < countOfLines; i++) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("0")) {
                output.append(" ");
            } else {
                int mainDigit = Integer.parseInt(inputLine) % 10;

                int offset = (mainDigit - 2) * 3;

                if (mainDigit > 7) {
                    offset++;
                }

                int letterIndex = offset + inputLine.length() - 1;

                output.append(String.format("%c", 'a' + letterIndex));
            }
        }

        System.out.println(output);
    }
}
