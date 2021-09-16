import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokePower = startPokePower;
        int countOfTargets = 0;

        while (pokePower >= distanceBetweenTargets) {
            countOfTargets++;
            pokePower -= distanceBetweenTargets;
            if (exhaustionFactor != 0) {
                if (startPokePower % 2 == 0 && startPokePower / 2 == pokePower) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(countOfTargets);
    }
}
