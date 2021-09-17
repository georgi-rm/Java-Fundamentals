import java.util.Scanner;

public class P10LadyBugs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfTheField = Integer.parseInt(scanner.nextLine());
        String[] initialLadyBugs = scanner.nextLine().split(" ");
        String[] field = new String[sizeOfTheField];

        for (int i = 0; i < field.length; i++) {
            field[i] = "0";
        }

        for (int i = 0; i < initialLadyBugs.length; i++) {
            int fieldIndex = Integer.parseInt(initialLadyBugs[i]);
            if (fieldIndex >= 0 && fieldIndex < field.length) {
                field[fieldIndex] = "1";
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            int index = Integer.parseInt(commandArray[0]);
            if (index >= 0 && index < field.length && field[index].equals("1")) {
                field[index] = "0";
                int flyLength = Integer.parseInt(commandArray[2]);
                int newIndex = index;
                int sign = 1;
                if (commandArray[1].equals("left")) {
                    sign = -1;
                }

                while (true) {
                    newIndex += sign * flyLength;
                    if (newIndex < 0 || newIndex >= field.length) {
                        break;
                    }
                    if (field[newIndex].equals("0")) {
                        field[newIndex] = "1";
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", field));
    }
}
