import java.util.Scanner;

// Дан массив действительных чисел, размерность которого N. 
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task1_3 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter sequence length: ");
            int size = scan.nextInt();
            System.out.println();
            int sequence[] = new int[size];
            System.out.println("Insert sequence elements:");

            for (int i = 0; i < size; i++) {
                sequence[i] = scan.nextInt();
            }

            int negativeDigit = 0;
            int zero = 0;
            int positiveDigit = 0;

            for (int digit : sequence) {
                if (digit < 0) {
                    negativeDigit++;
                } else if (digit > 0) {
                    positiveDigit++;
                } else {
                    zero++;
                }
            }

            System.out.println();
            System.out.println("In this sequence:");
            System.out.println("negative digits - " + negativeDigit);
            System.out.println("zeroes - " + zero);
            System.out.println("positive digits - " + positiveDigit);
        }
    }
}