import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static Map<Long,Long> fibonacciCache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());

        long result = getFibonacci(number);
        System.out.println(result);
    }

    private static long getFibonacci(long number) {
        if ( number <= 2) {
            return 1;
        }
        else if (fibonacciCache.containsKey(number))
        {
            return fibonacciCache.get(number);
        }
        else {
            long result = getFibonacci(number - 1) + getFibonacci(number - 2);
            fibonacciCache.put(number,result);
            return result;
        }
    }
}
