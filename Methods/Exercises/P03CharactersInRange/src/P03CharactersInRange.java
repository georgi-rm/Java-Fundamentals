import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstCharacter = scanner.nextLine().charAt(0);
        char lastCharacter = scanner.nextLine().charAt(0);

        if (firstCharacter < lastCharacter) {
            printCharactersInRange(firstCharacter, lastCharacter);
        } else {
            printCharactersInRange(lastCharacter, firstCharacter);
        }
    }

    private static void printCharactersInRange(char start, char end) {
        for (char i = (char) (start + 1); i < end; i++) {
            System.out.print(i + " ");
        }
    }
}
