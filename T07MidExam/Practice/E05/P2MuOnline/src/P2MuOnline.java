import java.util.Scanner;

public class P2MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = scanner.nextLine().split("\\|+");

        for (int roomIndex = 0; roomIndex < rooms.length; roomIndex++) {
            String[] commandParameters = rooms[roomIndex].split("\\s+");
            switch (commandParameters[0]) {
                case "potion":
                    int heal = Integer.parseInt(commandParameters[1]);
                    if (health + heal > 100) {
                        heal = 100 - health;
                    }
                    health += heal;
                    System.out.printf("You healed for %d hp.%n", heal);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    int bitcoinsFound = Integer.parseInt(commandParameters[1]);
                    bitcoins += bitcoinsFound;
                    System.out.printf("You found %d bitcoins.%n", bitcoinsFound);
                    break;
                default:
                    int monsterAttack = Integer.parseInt(commandParameters[1]);
                    health -= monsterAttack;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", commandParameters[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", commandParameters[0]);
                        System.out.printf("Best room: %d%n", roomIndex + 1);
                    }
                    break;
            }
            if (health <= 0) {
                break;
            }
        }

        if(health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
