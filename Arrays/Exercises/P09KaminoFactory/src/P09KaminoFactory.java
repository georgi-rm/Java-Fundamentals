import java.util.Scanner;

public class P09KaminoFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequences = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int[] bestDnaSequence = new int[lengthOfSequences];

        int bestDnaSubSequenceLength = 0;
        int bestDnaSubSequenceIndex = 0;
        int bestDnaCountOfOnes = 0;
        int numberOfDnaSample = 0;
        int numberOfBestDna = 0;

        while (!input.equals("Clone them!")) {
            int subSequenceIndex = 0;
            int subSequenceLength = 0;
            int longestSubSequenceIndex = 0;
            int longestSubSequenceLength = 0;
            int currentDnaCountOfOnes = 0;
            boolean isBestDna = false;

            int[] dnaSequence = new int[lengthOfSequences];
            int ix = 0;
            for (int i = 0; i < input.length(); i++) {
                char element = input.charAt(i);
                if (element == '0') {
                    dnaSequence[ix++] = 0;
                } else if (element == '1') {
                    dnaSequence[ix++] = 1;
                }

                if (ix >= dnaSequence.length) {
                    break;
                }
            }
            numberOfDnaSample++;
            for (int i = 0; i < dnaSequence.length; i++) {
                if (dnaSequence[i] == 1) {
                    currentDnaCountOfOnes++;
                    if (subSequenceLength == 0) {
                        subSequenceIndex = i;
                    }
                    subSequenceLength++;
                    if (subSequenceLength > longestSubSequenceLength) {
                        longestSubSequenceIndex = subSequenceIndex;
                        longestSubSequenceLength = subSequenceLength;
                    }
                } else if (dnaSequence[i] == 0) {
                    subSequenceLength = 0;
                }
            }
            if (longestSubSequenceLength > bestDnaSubSequenceLength) {
                isBestDna = true;
            } else if (longestSubSequenceLength == bestDnaSubSequenceLength) {
                if (longestSubSequenceIndex < bestDnaSubSequenceIndex) {
                    isBestDna = true;
                } else if (longestSubSequenceIndex == bestDnaSubSequenceIndex) {
                    if (currentDnaCountOfOnes > bestDnaCountOfOnes) {
                        isBestDna = true;
                    }
                }
            }

            if (isBestDna || numberOfBestDna == 0) {
                numberOfBestDna = numberOfDnaSample;
                for (int i = 0; i < bestDnaSequence.length; i++) {
                    bestDnaSequence[i] = dnaSequence[i];
                }
                bestDnaSubSequenceIndex = longestSubSequenceIndex;
                bestDnaSubSequenceLength = longestSubSequenceLength;
                bestDnaCountOfOnes = currentDnaCountOfOnes;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", numberOfBestDna, bestDnaCountOfOnes);
        for (int i = 0; i < bestDnaSequence.length; i++) {
            System.out.printf("%d ", bestDnaSequence[i]);
        }

    }
}
