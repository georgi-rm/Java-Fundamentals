import java.util.Scanner;

import static java.util.Arrays.stream;

public class P08MagicSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == magicNumber) {
                    System.out.printf("%d %d\n", inputArray[i], inputArray[j]);
                }
            }
        }

    }
}
