import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());

        Pattern barcodePattern = Pattern.compile("\b?@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+\b?");

        for (int i = 0; i < numberOfBarcodes; i++) {
            Matcher barcodeMatcher = barcodePattern.matcher(scanner.nextLine());

            if (barcodeMatcher.find()) {
                String productGroup = GetProductGroup(barcodeMatcher.group());
                System.out.printf("Product group: %s%n", productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String GetProductGroup(String barcode) {
        Pattern digitPatter = Pattern.compile("\\d");
        Matcher digitMatcher = digitPatter.matcher(barcode);

        StringBuilder productGroup = new StringBuilder();

        while (digitMatcher.find()) {
            productGroup.append(digitMatcher.group());
        }
        if (productGroup.length() == 0) {
            productGroup.append("00");
        }
        return productGroup.toString();
    }
}
