import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (arrayOfNumbers.length > 1) {
            int[] condensedArray = new int[arrayOfNumbers.length - 1];

            for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                condensedArray[i] = arrayOfNumbers[i] + arrayOfNumbers[i + 1];
            }
            arrayOfNumbers = condensedArray;
        }

        System.out.println(arrayOfNumbers[0]);
    }
}
