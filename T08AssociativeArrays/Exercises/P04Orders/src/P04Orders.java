import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Product> products = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] inputData = input.split("\\s+");

            String productName = inputData[0];

            Product newProduct = new Product(0, 0);

            if (products.containsKey(productName)) {
                newProduct = products.get(productName);
            }
            newProduct.setPrice(Double.parseDouble(inputData[1]));
            newProduct.setQuantity(newProduct.getQuantity() + Double.parseDouble(inputData[2]));
            products.put(productName, newProduct);

            input = scanner.nextLine();
        }

        products.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value.getPrice() * value.getQuantity()));
    }
}

