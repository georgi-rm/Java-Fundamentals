import java.util.Scanner;

public class P01Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagons = new int[numberOfWagons];
        int sumOfPeople = 0;

        for (int i = 0; i < peopleInWagons.length; i++) {
            peopleInWagons[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < peopleInWagons.length; i++) {
            System.out.printf("%d ", peopleInWagons[i]);
            sumOfPeople += peopleInWagons[i];
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
