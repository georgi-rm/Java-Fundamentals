import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern emailPattern = Pattern.compile("[A-Za-z0-9][A-Za-z0-9.\\-_]*@[A-Za-z][A-Za-z\\-]*\\.[A-Za-z][A-Za-z\\-]*(\\.[A-Za-z][A-Za-z\\-]*)*");
        Matcher emailMatcher = emailPattern.matcher(input);

        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

    }
}
