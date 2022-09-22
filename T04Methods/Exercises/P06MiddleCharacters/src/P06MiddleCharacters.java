import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String middleSymbols = getMiddleSymbols(input);
        System.out.println(middleSymbols);
    }

    private static String getMiddleSymbols(String source) {
        String output = "";
        int middleIndex = source.length() / 2;
        if (source.length() % 2 == 0) {
            output += source.charAt(middleIndex - 1);
        }
        output += source.charAt(middleIndex);
        return output;
    }
}
