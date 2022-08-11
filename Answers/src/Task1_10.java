import java.util.Scanner;

// Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

public class Task1_10 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter array length: ");
            int size = scan.nextInt();
            System.out.println();
            int sequence[] = new int[size];
            System.out.println("Insert elements of array:");

            for (int i = 0; i < size; i++) {
                sequence[i] = scan.nextInt();
            }

            System.out.println();
            System.out.println("Input array: ");
            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " ");
            }

            for (int i = 0; i < sequence.length; i++) {
                if (i % 2 != 0) {
                    sequence[i] = 0;
                }
            }

            System.out.println();
            System.out.println("Output array: ");
            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " ");
            }
        }
    }
}