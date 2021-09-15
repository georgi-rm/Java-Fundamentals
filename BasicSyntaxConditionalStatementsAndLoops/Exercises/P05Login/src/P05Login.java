import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
        boolean isPasswordCorrect = false;

        for (int i = username.length() - 1; i >= 0; i--) {
            correctPassword = correctPassword + username.charAt(i);
        }

        for (int i = 0; i < 4; i++) {
            String password = scanner.nextLine();
            if (password.equals(correctPassword)) {
                isPasswordCorrect = true;
                break;
            }
            if (i < 3) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (isPasswordCorrect) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
