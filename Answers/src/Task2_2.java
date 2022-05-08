import java.util.Scanner;

public class Task2_2 {

    // Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
    // больше последнего.

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter side size of a square matrix: ");
            int size = scan.nextInt();

            int matrix[][] = new int[size][size];

            System.out.println("Insert matrix elements:");

            for (int i = 0; i < size; i++) {

                for (int j = 0; j < size; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            System.out.println();
            System.out.print("The first diagonal: ");

            for (int i = 0; i < size; i++) {
                System.out.print(matrix[i][i] + " ");
            }
            System.out.println();
            System.out.print("The second diagonal: ");

            for (int i = 0; i < size; i++) {
                System.out.print(matrix[i][size - 1 - i] + " ");
            }
        }

    }
}