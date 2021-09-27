import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Hero> playerHeroes = new LinkedHashMap<>();
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        for (int ixHeroes = 0; ixHeroes < numberOfHeroes; ixHeroes++) {
            String[] heroParts = scanner.nextLine().split("\\s+");
            String heroName = heroParts[0];
            int health = Integer.parseInt(heroParts[1]);
            int mana = Integer.parseInt(heroParts[2]);
            Hero heroData = new Hero(health, mana);
            playerHeroes.put(heroName, heroData);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandData = input.split(" - ");
            String commandName = commandData[0];
            String heroName = commandData[1];

            switch (commandName) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(commandData[2]);
                    String spellName = commandData[3];
                    if (playerHeroes.get(heroName).getMana() >= manaNeeded) {
                        playerHeroes.get(heroName).castSpell(manaNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, playerHeroes.get(heroName).getMana());
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",
                                heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandData[2]);
                    String attacker = commandData[3];
                    playerHeroes.get(heroName).takeDamage(damage);
                    int healthLeft = playerHeroes.get(heroName).getHealth();
                    if (healthLeft > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, healthLeft);
                    } else {
                        playerHeroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int manaAmount = Integer.parseInt(commandData[2]);
                    int oldManaAmount = playerHeroes.get(heroName).getMana();
                    playerHeroes.get(heroName).rechargeMana(manaAmount);
                    System.out.printf("%s recharged for %d MP!%n", heroName,
                            playerHeroes.get(heroName).getMana() - oldManaAmount);
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(commandData[2]);
                    int oldHealthAmount = playerHeroes.get(heroName).getHealth();
                    playerHeroes.get(heroName).heal(healAmount);
                    System.out.printf("%s healed for %d HP!%n", heroName,
                            playerHeroes.get(heroName).getHealth() - oldHealthAmount);
                    break;
            }
            input = scanner.nextLine();
        }
        playerHeroes.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int result = Integer.compare(e2.getValue().getHealth(), e1.getValue().getHealth());
                    if (result == 0) {
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.printf("%s%n  HP: %d%n  MP: %d%n",
                        entry.getKey(),
                        entry.getValue().getHealth(),
                        entry.getValue().getMana()));
    }
}
