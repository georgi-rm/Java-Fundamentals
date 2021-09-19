import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int wagonSize = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if( wagons.get(i) + passengers <= wagonSize) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
    }
}
