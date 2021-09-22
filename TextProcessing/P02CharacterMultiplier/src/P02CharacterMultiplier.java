import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        System.out.println(MultiplyStrings(input[0], input[1]));
    }

    private static int MultiplyStrings(String firstString, String secondString) {
        int result = 0;

        int i = 0;

        for ( i = 0; i < Math.min(firstString.length(), secondString.length()); i++) {
            result += firstString.charAt(i) * secondString.charAt(i);
        }

        for ( ; i < firstString.length(); i++) {
            result += firstString.charAt(i);
        }

        for ( ; i < secondString.length(); i++) {
            result += secondString.charAt(i);
        }

        return result;
    }
}
