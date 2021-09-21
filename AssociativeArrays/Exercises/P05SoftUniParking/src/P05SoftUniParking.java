import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEntries = Integer.parseInt(scanner.nextLine());

        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < numberOfEntries; i++) {
            String[] commandData = scanner.nextLine().split("\\s+");
            String username = commandData[1];
            switch (commandData[0]) {
                case "register":
                    String licensePlate = commandData[2];
                    if (users.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", users.get(username));
                    } else {
                        users.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully%n", username, licensePlate);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(username)) {
                        users.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    break;
            }
        }

        users.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
