import java.util.Scanner;

import static java.util.Arrays.stream;

public class P06EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isElementFound = false;

        for (int i = 0; i < inputArray.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (j < i) {
                    leftSum += inputArray[j];
                } else if (j > i) {
                    rightSum += inputArray[j];
                }
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                isElementFound = true;
                break;
            }
        }
        if (!isElementFound) {
            System.out.println("no");
        }
    }
}
