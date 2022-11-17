import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);

                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstChar = first.charAt(0);
                char secondChar = second.charAt(0);

                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }
}
