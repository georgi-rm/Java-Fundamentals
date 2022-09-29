import java.util.Scanner;

public class P07TheaterPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 0 || age > 122) {
            System.out.println("Error!");
            return;
        }

        int price = 0;

        switch (typeOfDay) {
            case "Weekday":
                if (age > 18 && age <= 64) {
                    price = 18;
                } else {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age > 18 && age <= 64) {
                    price = 20;
                } else {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age <= 18) {
                    price = 5;
                } else if (age <= 64) {
                    price = 12;
                } else {
                    price = 10;
                }
                break;
        }

        System.out.printf("%d$", price);
    }
}
