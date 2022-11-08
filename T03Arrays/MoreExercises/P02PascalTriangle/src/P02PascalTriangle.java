import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfRows = Integer.parseInt(scanner.nextLine());

        int[][] triangle = new int[countOfRows][];

        for (int row = 0; row < triangle.length; row++) {
            int[] rowElements = new int[row + 1];
            rowElements[0] = 1;
            for (int col = 1; col < rowElements.length; col++) {
                if (col == rowElements.length - 1) {
                    rowElements[col] = 1;
                } else {
                    rowElements[col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                }
            }
            triangle[row] = rowElements;
        }

        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}
