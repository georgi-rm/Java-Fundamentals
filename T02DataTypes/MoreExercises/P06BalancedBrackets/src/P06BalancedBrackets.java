import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfLines = Integer.parseInt(scanner.nextLine());

        boolean isBracketOpened = false;
        boolean isBalanced = true;

        for (int i = 0; i < countOfLines; i++) {
            String lineData = scanner.nextLine();

            if (lineData.equals("(")) {
                if (isBracketOpened) {
                    isBalanced = false;
                    break;
                } else {
                    isBracketOpened = true;
                }
            } else if (lineData.equals(")")) {
                if (isBracketOpened) {
                    isBracketOpened = false;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBracketOpened) {
            isBalanced = false;
        }

        System.out.println(isBalanced ? "BALANCED" : "UNBALANCED");
    }
}
