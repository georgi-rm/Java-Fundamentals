import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^.|$%]*<(?<product>\\w+)>[^.|$%]*\\|(?<quantity>\\d+)\\|[^.|$%\\d]*(?<price>\\d+\\.?\\d*)\\$");
        double totalIncome = 0;


        while (!input.equals("end of shift")) {
            Matcher matcherOrder = pattern.matcher(input);

            while (matcherOrder.find()) {
                String customer = matcherOrder.group("customer");
                String productName = matcherOrder.group("product");
                int quantity = Integer.parseInt(matcherOrder.group("quantity"));
                double price = Double.parseDouble(matcherOrder.group("price"));
                double total = quantity * price;

                totalIncome += total;
                System.out.printf("%s: %s - %.2f%n", customer, productName, total);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}
