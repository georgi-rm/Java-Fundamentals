import java.util.Scanner;

public class P03ZigZagArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPairs = Integer.parseInt(scanner.nextLine());

        String[] pair = new String[2];
        String[] firstArray = new String[numberOfPairs];
        String[] secondArray = new String[numberOfPairs];

        for (int i = 0; i < numberOfPairs; i++) {
            pair = scanner.nextLine().split(" ");
            if ((i + 1) % 2 == 0) {
                firstArray[i] = pair[1];
                secondArray[i] = pair[0];
            } else {
                firstArray[i] = pair[0];
                secondArray[i] = pair[1];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
