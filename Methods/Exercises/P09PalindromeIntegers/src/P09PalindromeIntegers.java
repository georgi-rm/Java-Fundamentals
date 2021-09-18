import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if ( isPalindrome(input) ) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
