import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalWithoutTaxes = 0;
        double taxes = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                totalWithoutTaxes += price;
            }
            input = scanner.nextLine();
        }
        taxes += totalWithoutTaxes * 0.2;
        double total = totalWithoutTaxes + taxes;

        if (input.equals("special")) {
            total *= 0.9;
        }
        if (total == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
