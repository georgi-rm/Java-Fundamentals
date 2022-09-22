import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] specialNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == specialNumbers[0]) {
                numbers.remove(i);

                for (int j = 0; j < specialNumbers[1]; j++) {
                    if (i < numbers.size()) {
                        numbers.remove(i);
                    }
                }

                for (int j = 0; j < specialNumbers[1]; j++) {
                    i--;
                    if (i >= 0) {
                        numbers.remove(i);
                    } else {
                        break;
                    }
                }

                i = 0;
            }
        }
        int sum = 0;
        for (Integer number:numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
