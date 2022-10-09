import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;

        String nameOfGame = scanner.nextLine();

        while (!nameOfGame.equals("Game Time")) {
            double price = 0;

            switch (nameOfGame) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
            }

            if( price == 0) {
                System.out.println("Not Found");
            } else {
                if(balance >= price) {
                    balance -= price;
                    totalSpent += price;
                    System.out.printf("Bought %s%n", nameOfGame);
                } else {
                    System.out.println("Too Expensive");
                }
            }

            if( balance == 0) {
                System.out.println("Out of money!");
                return;
            }

            nameOfGame = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);

    }
}
