import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (typeOfGroup) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    price = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 9.80;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 10.46;
                }
                price *= groupOfPeople;
                if (groupOfPeople >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    price = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 16;
                }
                if (groupOfPeople >= 100) {
                    groupOfPeople -= 10;
                }
                price *= groupOfPeople;
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    price = 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 20;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 22.50;
                }
                price *= groupOfPeople;
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.02f", price);
    }
}
