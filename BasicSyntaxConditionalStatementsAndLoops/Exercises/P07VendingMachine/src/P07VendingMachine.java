import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;

        while (!input.equals("Start")) {
            double insertedCoins = Double.parseDouble(input);
            if ((insertedCoins == 0.1) || (insertedCoins == 0.2) || (insertedCoins == 0.5)
                    || (insertedCoins == 1.0) || (insertedCoins == 2.0)) {
                money += insertedCoins;
            } else {
                System.out.printf("Cannot accept %.02f%n", insertedCoins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            double price = Double.NEGATIVE_INFINITY;
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if ( price >= 0 )
            {
                if ( price > money ) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    money -= price;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.02f", money);
    }
}
