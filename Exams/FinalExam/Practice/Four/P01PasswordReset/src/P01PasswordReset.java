import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" ");
            String commandName = command[0];

            switch (commandName) {
                case "TakeOdd":
                    String tempPassword = password.toString();
                    password.setLength(0);
                    for (int i = 1; i < tempPassword.length(); i += 2) {
                        password.append(tempPassword.charAt(i));
                    }
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    String cutElement = password.substring(index, index + length);
                    int indexOfFirstCutElement = password.indexOf(cutElement);
                    if (indexOfFirstCutElement >= 0) {
                        password.delete(indexOfFirstCutElement, indexOfFirstCutElement + cutElement.length());
                    }
                    System.out.println(password);
                    break;
                case "Substitute":
                    String findPart = command[1];
                    String substitute = command[2];
                    String passwordAsString = password.toString();
                    if (password.indexOf(findPart) < 0) {
                        System.out.println("Nothing to replace!");
                    } else {
                        password.setLength(0);
                        password.append(passwordAsString.replace(findPart, substitute));
                        System.out.println(password);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password.toString());
    }
}
