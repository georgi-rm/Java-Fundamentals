import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};

        int dayIndex = Integer.parseInt(scanner.nextLine()) - 1;
        if (dayIndex >= 0 && dayIndex < daysOfWeek.length) {
            System.out.println(daysOfWeek[dayIndex]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
