import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int indexStartOfName = input.lastIndexOf('\\') + 1;
        int indexEndOfName = input.lastIndexOf('.');
        int indexStartOfExtension = input.lastIndexOf('.') + 1;

        System.out.println("File name: " + input.substring(indexStartOfName, indexEndOfName));
        System.out.println("File extension: " + input.substring(indexStartOfExtension));
    }
}
