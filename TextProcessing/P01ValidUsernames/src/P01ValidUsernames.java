import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String username : userNames) {
            boolean isValidUserName = username.length() >= 3 && username.length() <= 16;

            if (isValidUserName) {
                for (int i = 0; i < username.length(); i++) {
                    char character = username.charAt(i);

                    if (character != '_' && character != '-' && !Character.isLetterOrDigit(character)) {
                        isValidUserName = false;
                    }
                }
            }

            if (isValidUserName) {
                System.out.println(username);
            }
        }
    }
}
