import java.util.Scanner;

// Даны действительные числа а1 ,а2 ,..., аn  .
// Поменять местами наибольший и наименьший элементы.

public class Task1_4 {

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

            int min = sequence[0];
            int minIndex = 0;
            int max = sequence[0];
            int maxIndex = 0;

            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] < min) {
                    min = sequence[i];
                    minIndex = i;
                }

                if (sequence[i] > max) {
                    max = sequence[i];
                    maxIndex = i;
                }
            }

            System.out.println();
            System.out.print("Old sequence: ");

            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " ");
            }

            sequence[minIndex] = max;
            sequence[maxIndex] = min;

            System.out.println();
            System.out.print("New sequence: ");

            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " ");
            }
        }
    }
}
