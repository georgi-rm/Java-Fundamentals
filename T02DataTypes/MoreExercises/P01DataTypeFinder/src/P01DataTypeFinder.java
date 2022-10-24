import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")) {
            String dataType = "string";

            if (inputLine.equalsIgnoreCase("true") || inputLine.equalsIgnoreCase("false")) {
                dataType = "boolean";
            } else if (isInteger(inputLine)) {
                dataType = "integer";
            } else if (isDouble(inputLine)) {
                dataType = "floating point";
            } else if (inputLine.length() == 1) {
                dataType = "character";
            }

            System.out.printf("%s is %s type%n", inputLine, dataType);

            inputLine = scanner.nextLine();
        }
    }

    public static boolean isInteger(String inputString) {

        int countOfDigits = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char symbol = inputString.charAt(i);

            if (symbol >= '0' && symbol <= '9') {
                countOfDigits++;
            } else if (i != 0 || (symbol != '-' && symbol != '+')) {
                return false;
            }
        }

        return countOfDigits > 0;
    }

    public static boolean isDouble(String inputString) {

        String language = System.getProperty("user.language");
        String country = System.getProperty("user.country");

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale(language, country));
        DecimalFormat df = (DecimalFormat) nf;
        DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
        char charDecimal = symbols.getDecimalSeparator();

        boolean hasDecimalSymbol = false;
        int countOfDigits = 0;
        int countOfDigitsAfterDecimalPoint = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char symbol = inputString.charAt(i);

            if (symbol >= '0' && symbol <= '9') {
                if (hasDecimalSymbol) {
                    countOfDigitsAfterDecimalPoint++;
                } else {
                    countOfDigits++;
                }
            } else if (symbol == charDecimal || symbol == '.' || symbol == ',') {
                if (hasDecimalSymbol) {
                    return false;
                }
                hasDecimalSymbol = true;
            } else if (i != 0 || (symbol != '-' && symbol != '+')) {
                return false;
            }
        }

        return countOfDigits > 0 && countOfDigitsAfterDecimalPoint > 0;
    }

}
