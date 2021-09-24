import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maximumBonus = 0;
        int attendancesOfBestStudent = 0;

        for (int i = 0; i < countOfStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());

            double totalBonus = 1.0 * attendances / countOfLectures * (5 + initialBonus);

            if (totalBonus > maximumBonus) {
                maximumBonus = totalBonus;
                attendancesOfBestStudent = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maximumBonus));
        System.out.printf("The student has attended %d lectures.", attendancesOfBestStudent);
    }
}
