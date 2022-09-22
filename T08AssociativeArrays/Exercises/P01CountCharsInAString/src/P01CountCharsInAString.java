import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> allCharacters = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            String symbol = "" + input.charAt(i);
            if (!symbol.equals(" ")) {
                if ( allCharacters.containsKey(symbol) ) {
                    Integer countOfOccurrences = allCharacters.get(symbol);
                    countOfOccurrences++;
                    allCharacters.put(symbol, countOfOccurrences);
                } else {
                    allCharacters.put(symbol, 1);
                }
            }
        }
        allCharacters.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
