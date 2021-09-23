import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPLanets = new ArrayList<>();

        StringBuilder decryptedMessage = new StringBuilder();

        for (int line = 0; line < numberOfMessages; line++) {
            String encryptedMessage = scanner.nextLine();

            int decryptionKey = CountSpecialCharactersInString(encryptedMessage);
            decryptedMessage.setLength(0);
            DecryptMessage(encryptedMessage, decryptedMessage, decryptionKey);

            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]*)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)");
            Matcher matcherPlanetData = pattern.matcher(decryptedMessage);
            while (matcherPlanetData.find()) {
                String planetName = matcherPlanetData.group("planetName");
//                int population = Integer.parseInt(matcherPlanetData.group("population"));
                String attackType = matcherPlanetData.group("attackType");
//                int soldierCount = Integer.parseInt(matcherPlanetData.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPLanets.add(planetName);
                }

            }
        }
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        attackedPlanets.stream().sorted().forEach(planet -> System.out.println("-> "+ planet));
        System.out.printf("Destroyed planets: %d%n", destroyedPLanets.size());
        destroyedPLanets.stream().sorted().forEach(planet -> System.out.println("-> "+ planet));
    }

    private static void DecryptMessage(String encryptedMessage, StringBuilder decryptedMessage, int decryptionKey) {
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char currentSymbol = encryptedMessage.charAt(i);
            currentSymbol -= decryptionKey;
            decryptedMessage.append(currentSymbol);
        }
    }

    private static int CountSpecialCharactersInString(String encryptedMessage) {
        int countOfSpecialSymbols = 0;
        String lowerCaseData = encryptedMessage.toLowerCase();
        for (int i = 0; i < lowerCaseData.length(); i++) {
            char symbol = lowerCaseData.charAt(i);

            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r' ) {
                countOfSpecialSymbols++;
            }
        }
        return countOfSpecialSymbols;
    }
}
