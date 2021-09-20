import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialArticle = scanner.nextLine().split(", ");

        Article myArticle = new Article(initialArticle[0], initialArticle[1], initialArticle[2]);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(": ");

            String commandName = command[0];
            String commandValue = command[1];

            switch (commandName) {
                case "Edit":
                    myArticle.edit(commandValue);
                    break;
                case "ChangeAuthor":
                    myArticle.changeAuthor(commandValue);
                    break;
                case "Rename":
                    myArticle.rename(commandValue);
                    break;
            }
        }

        System.out.println(myArticle);
    }
}
