import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> demonNames = Arrays.stream(scanner.nextLine().split(" *,+ *")).sorted().collect(Collectors.toList());

        Pattern patternHealth = Pattern.compile("[^0-9\\+\\-*\\/\\.\\s,]");
        Pattern patternBaseDamage = Pattern.compile("[+-]?[\\d]+(\\.[\\d]+)?");
        Pattern patternDamageMultiplier = Pattern.compile("[\\*\\/]");

        for (int name = 0; name < demonNames.size(); name++) {
            Matcher matcherHealth = patternHealth.matcher(demonNames.get(name));
            int health = 0;
            double damage = 0;

            while (matcherHealth.find()) {
                health += matcherHealth.group().charAt(0);
            }

            Matcher matcherBaseDamage = patternBaseDamage.matcher(demonNames.get(name));

            while (matcherBaseDamage.find()) {
                damage += Double.parseDouble(matcherBaseDamage.group());
            }

            Matcher matcherDamageMultiplier = patternDamageMultiplier.matcher(demonNames.get(name));

            while (matcherDamageMultiplier.find()) {
                if (matcherDamageMultiplier.group().equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demonNames.get(name), health, damage);
        }

    }
}
