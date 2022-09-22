import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        double watterInTank = 0;
        for (int i = 0; i < numberOfLines; i++) {
            double newWatter = Double.parseDouble(scanner.nextLine());
            if (watterInTank + newWatter <= 255) {
                watterInTank += newWatter;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%.0f", watterInTank);
    }
}
