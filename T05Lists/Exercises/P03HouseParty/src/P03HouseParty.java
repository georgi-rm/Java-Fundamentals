import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            List<String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            String guestName = command.get(0);
            if (command.contains("not")) {
                if (guestList.contains(guestName)) {
                    guestList.remove(guestName);
                } else {
                    System.out.printf("%s is not in the list!%n", guestName);
                }
            } else {
                if (guestList.contains(guestName)) {
                    System.out.printf("%s is already in the list!%n", guestName);
                } else {
                    guestList.add(guestName);
                }
            }
        }
        for (String guest:guestList) {
            System.out.printf("%s%n", guest);
        }
    }
}
