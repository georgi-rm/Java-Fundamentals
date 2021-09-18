import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid");
        }

    }

    private static boolean isPasswordValid(String password) {
        boolean isPasswordValid = true;

        if ( !checkPasswordSize(password) ) {
            System.out.println("Password must be between 6 and 10 characters");
            isPasswordValid = false;
        }

        if (!checkPasswordContent(password)) {
            System.out.println("Password must consist only of letters and digits");
            isPasswordValid = false;
        }

        if (!checkPasswordDigitsCount(password)) {
            System.out.println("Password must have at least 2 digits");
            isPasswordValid = false;
        }

        return isPasswordValid;
    }

    private static boolean checkPasswordSize(String password) {
        return (password.length() >= 6 && password.length() <= 10);
    }

    private static boolean checkPasswordContent(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkPasswordDigitsCount(String password) {
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
            if (countDigits >= 2) {
                return true;
            }
        }
        return false;
    }
}
