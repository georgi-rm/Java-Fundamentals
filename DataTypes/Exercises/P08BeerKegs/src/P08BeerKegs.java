import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        String nameOfBiggestKeg = "";
        double volumeOfBiggestKeg = 0;
        for (int i = 0; i < numberOfKegs; i++) {
            String name = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * r * r * h;

            if (volume > volumeOfBiggestKeg) {
                volumeOfBiggestKeg = volume;
                nameOfBiggestKeg = name;
            }
        }
        System.out.println(nameOfBiggestKeg);
    }
}
