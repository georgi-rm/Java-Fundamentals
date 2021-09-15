import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());

        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double rageExpenses = (int)(lostGames / 2) * headsetPrice + (int)(lostGames / 3) * mousePrice
                + (int)(lostGames / 6) * keyboardPrice + (int)(lostGames / 12) * displayPrice;
        System.out.printf("Rage expenses: %.02f lv.", rageExpenses);
    }
}
