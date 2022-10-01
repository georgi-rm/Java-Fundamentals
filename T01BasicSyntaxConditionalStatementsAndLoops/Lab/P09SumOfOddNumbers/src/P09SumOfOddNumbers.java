import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfOddNumbers = 0;
        int countOfOddNumbers = 0;

        int number = 1;

        int n = Integer.parseInt(scanner.nextLine());

        while (countOfOddNumbers < n) {
            System.out.println(number);
            sumOfOddNumbers += number;
            number += 2;
            countOfOddNumbers++;
        }

        System.out.printf("Sum: %d", sumOfOddNumbers);
    }
}
