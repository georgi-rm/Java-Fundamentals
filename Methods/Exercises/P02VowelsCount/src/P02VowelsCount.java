import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countOfVowels = 0;

        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                countOfVowels++;
            }
        }
        System.out.println(countOfVowels);
    }

    private static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
