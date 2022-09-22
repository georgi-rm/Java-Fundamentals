import java.util.Scanner;

public class P04ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String temporaryContainer = inputArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j+1];
            }
            inputArray[inputArray.length-1] = temporaryContainer;
        }
        System.out.println(String.join(" ", inputArray));
    }
}
