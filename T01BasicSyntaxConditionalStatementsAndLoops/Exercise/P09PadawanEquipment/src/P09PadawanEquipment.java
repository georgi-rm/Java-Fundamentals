import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double numberOfLightSabers = Math.ceil(countOfStudents * 1.1);
        int numberOfBelts = countOfStudents - countOfStudents / 6;
        double moneyNeeded = numberOfLightSabers * priceOfLightSaber + countOfStudents * priceOfRobe
                + numberOfBelts * priceOfBelt;

        String totalPrice = String.format("%.02f", moneyNeeded);
        String budgetString = String.format("%.02f", budget);

        if (totalPrice.equals(budgetString) || moneyNeeded < budget) {
            System.out.printf("The money is enough - it would cost %.02flv.", moneyNeeded);
        } else {
            System.out.printf("George Lucas will need %.02flv more.", Math.abs(budget - moneyNeeded));
        }
    }
}
