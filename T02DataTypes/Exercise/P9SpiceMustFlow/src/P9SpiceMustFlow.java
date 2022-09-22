import java.util.Scanner;

public class P9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produced = Integer.parseInt(scanner.nextLine());
        int spiceInStorage  = 0;
        int days = 0;

        while (produced >= 100) {
            spiceInStorage += produced;
            if (spiceInStorage > 26) {
                spiceInStorage -= 26;
            }
            produced -= 10;
            days += 1;
        }
        if (spiceInStorage > 26) {
            spiceInStorage -= 26;
        }
        System.out.println(days);
        System.out.println(spiceInStorage);
    }
}
