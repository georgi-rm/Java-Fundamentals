import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoneySpent = 0;
        List<String> items = new ArrayList<>();

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String itemName = matcher.group("item");
                double price = Double.parseDouble(matcher.group("price"));
                double quantity = Double.parseDouble(matcher.group("quantity"));
                items.add(itemName);
                totalMoneySpent += price * quantity;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalMoneySpent);
    }
}
