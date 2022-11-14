import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = calculateAreaOfRectangle(width, length);

        System.out.println(Math.round(area));
    }

    public static double calculateAreaOfRectangle(double width, double length) {
        return width * length;
    }

}
