import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        Collections.reverse(arrays);

        for (String array:arrays) {
            List<String> numbersArray = Arrays.stream(array.split("\\s+")).collect(Collectors.toList());
            for (String number: numbersArray ) {
                if (!number.equals("")) {
                    System.out.printf("%s ", number);
                }
            }
        }
    }
}
