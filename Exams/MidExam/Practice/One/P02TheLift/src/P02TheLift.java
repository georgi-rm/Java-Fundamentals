import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        int[] liftWagons = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < liftWagons.length; i++) {
            int freeSeats = 4 - liftWagons[i];
            if (freeSeats <= 0) {
                continue;
            }
            if (peopleInQueue <= 0) {
                break;
            }
            if (peopleInQueue > freeSeats) {
                peopleInQueue -= freeSeats;
                liftWagons[i] += freeSeats;
            } else {
                liftWagons[i] += peopleInQueue;
                peopleInQueue = 0;
                break;
            }
        }

        if (peopleInQueue == 0) {
            boolean isLiftFull = true;
            for (int cabin : liftWagons) {
                if (cabin != 4) {
                    isLiftFull = false;
                    break;
                }
            }
            if (!isLiftFull) {
                System.out.println("The lift has empty spots!");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }

        for (int cabin : liftWagons) {
            System.out.printf("%d ", cabin);
        }
    }
}
