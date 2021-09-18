import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] array = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            int result;
            switch (command[0]) {
                case "exchange":
                    if (!exchangeArrayElements(array, Integer.parseInt(command[1]))) {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    result = findMaxEvenOddElement(command[1].equals("even"), array);
                    if (result < 0) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(result);
                    }
                    break;
                case "min":
                    result = findMinEvenOddElement(command[1].equals("even"), array);
                    if (result < 0) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(result);
                    }
                    break;
                case "first":
                    printFirstXEvenOddElements(Integer.parseInt(command[1]), command[2].equals("even"), array);
                    break;
                case "last":
                    printLastXEvenOddElements(Integer.parseInt(command[1]), command[2].equals("even"), array);
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.printf(", %d", array[i]);
            }
        }
        System.out.println("]");
    }

    private static boolean exchangeArrayElements(int[] array, int exchangeSplitIndex) {

        if (exchangeSplitIndex < 0 || exchangeSplitIndex >= array.length) {
            return false;
        }

        exchangeSplitIndex++;

        int[] tempArray = new int[exchangeSplitIndex];
        int ix = 0;

        System.arraycopy(array, 0, tempArray, 0, exchangeSplitIndex);

        for (int secondPartIndex = exchangeSplitIndex; secondPartIndex < array.length; secondPartIndex++, ix++) {
            array[ix] = array[secondPartIndex];
        }

        for (int i = 0; ix < array.length && i < tempArray.length; i++, ix++) {
            array[ix] = tempArray[i];
        }
        return true;
    }


    private static int findMaxEvenOddElement(boolean isEven, int[] array) {
        int indexOfMaxElement = -1;
        int valueOfMaxElement = Integer.MIN_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] > valueOfMaxElement) {
                if (isEven && (array[i] % 2 == 0)
                        || (!isEven && (array[i] % 2 != 0))) {
                    valueOfMaxElement = array[i];
                    indexOfMaxElement = i;
                }
            }
        }

        return indexOfMaxElement;
    }

    private static int findMinEvenOddElement(boolean isEven, int[] array) {
        int indexOfMinElement = -1;
        int valueOfMinElement = Integer.MAX_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] < valueOfMinElement) {
                if (isEven && (array[i] % 2 == 0)
                        || (!isEven && (array[i] % 2 != 0))) {
                    valueOfMinElement = array[i];
                    indexOfMinElement = i;
                }
            }
        }

        return indexOfMinElement;
    }


    private static void printFirstXEvenOddElements(int numberOfElementsToPrint, boolean isEven, int[] array) {

        if (numberOfElementsToPrint > array.length) {
            System.out.println("Invalid count");
            return;
        }
        int elementsPrinted = 0;
        System.out.print("[");
        for (int number : array) {
            if ((isEven && (number % 2 == 0)) || (!isEven && (number % 2 != 0))) {
                if (elementsPrinted == 0) {
                    System.out.print(number);
                } else {
                    System.out.printf(", %d", number);
                }
                elementsPrinted++;
                if (elementsPrinted >= numberOfElementsToPrint) {
                    break;
                }
            }
        }
        System.out.println("]");
    }

    private static void printLastXEvenOddElements(int numberOfElementsToPrint, boolean isEven, int[] array) {
        if (numberOfElementsToPrint > array.length) {
            System.out.println("Invalid count");
            return;
        }
        int[] lastElements = new int[numberOfElementsToPrint];
        int elementsPrinted = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if ((isEven && (array[i] % 2 == 0)) || (!isEven && (array[i] % 2 != 0))) {
                lastElements[elementsPrinted++] = array[i];
                if (elementsPrinted >= lastElements.length) {
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = elementsPrinted - 1; i >= 0; i--) {
            if (i == elementsPrinted - 1) {
                System.out.print(lastElements[i]);
            } else {
                System.out.printf(", %d", lastElements[i]);
            }
        }
        System.out.println("]");
    }
}
