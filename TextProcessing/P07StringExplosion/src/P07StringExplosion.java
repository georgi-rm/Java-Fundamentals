import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        int explosionStrength = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (currentSymbol == '>') {
                explosionStrength += input.charAt(i + 1) - '0';
            } else if (explosionStrength > 0){
                explosionStrength--;
                continue;
            }
            output.append(currentSymbol);
        }
        System.out.println(output);
    }
}
