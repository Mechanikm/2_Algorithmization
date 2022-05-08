import java.util.Scanner;

public class Task2_1 {

    // Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
    // больше последнего.

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter number of matrix rows: ");
            int row = scan.nextInt();
            System.out.println("Enter number of matrix columns: ");
            int column = scan.nextInt();
            int columnCount = 0;
            int matrix[][] = new int[row][column];

            System.out.println("Insert matrix elements:");

            for (int i = 0; i < row; i++) {

                for (int j = 0; j < column; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            for (int i = 0; i < column; i += 2) {
                if (matrix[0][i] > matrix[row - 1][i]) {
                    columnCount++;
                    if (columnCount == 1) {
                        System.out.println();
                        System.out.println("Your answer: ");
                        System.out.println();
                    }
                    System.out.println("column " + (i + 1));

                    for (int j = 0; j < row; j++) {
                        System.out.println(matrix[j][i]);
                    }
                    System.out.println();
                }
            }
            if (columnCount == 0) {
                System.out.println();
                System.out.println("There is not any matching columns");
            }
        }
    }
}