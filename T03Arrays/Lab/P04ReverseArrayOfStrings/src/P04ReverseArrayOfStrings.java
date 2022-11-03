import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOfStrings = scanner.nextLine().split(" ");

        for (int i = 0; i < arrayOfStrings.length / 2; i++) {
            swapElements(arrayOfStrings, i, arrayOfStrings.length - 1 - i);
        }

        System.out.println(String.join(" ", arrayOfStrings));
    }

    public static void swapElements(String[] inputArray, int firstIndex, int secondIndex) {
        String temp = inputArray[firstIndex];
        inputArray[firstIndex] = inputArray[secondIndex];
        inputArray[secondIndex] = temp;
    }
}
