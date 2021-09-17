import java.util.Scanner;

import static java.util.Arrays.stream;

public class P07MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int indexOfLongestSequence = 0;
        int indexOfCurrentSequence = 0;
        int lengthOfLongestSequence = 0;
        int sequenceLength = 0;
        int currentSequenceNumber = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == currentSequenceNumber) {
                sequenceLength++;
                if (sequenceLength > lengthOfLongestSequence) {
                    indexOfLongestSequence = indexOfCurrentSequence;
                    lengthOfLongestSequence = sequenceLength;
                }
            } else {
                currentSequenceNumber = input[i];
                indexOfCurrentSequence = i;
                sequenceLength = 1;
            }
        }
        for (int i = indexOfLongestSequence; i < indexOfLongestSequence + lengthOfLongestSequence; i++) {
            System.out.printf("%d ", input[i]);
        }
    }
}
