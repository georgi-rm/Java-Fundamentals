import java.util.Scanner;

import static java.util.Arrays.stream;

public class P05TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] topIntegers = new int[inputArray.length];
        int topInteger = Integer.MIN_VALUE;
        int numberOfTopIntegers = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] > topInteger) {
                topInteger = inputArray[i];
                topIntegers[numberOfTopIntegers++] = inputArray[i];
            }
        }
        for (int i = numberOfTopIntegers-1; i >=0 ; i--) {
            System.out.printf("%d ", topIntegers[i]);
        }
    }
}
