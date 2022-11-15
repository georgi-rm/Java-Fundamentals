import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, repeatTimes);

        System.out.println(result);
    }

    public static String repeatString(String text, int repeatTimes) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < repeatTimes; i++) {
            output.append(text);
        }

        return output.toString();
    }
}
