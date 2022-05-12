import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// Даны две последовательности a1 ≤ a2 ≤ ... ≤a5 ≤ an и b1 ≤ b2 ≤ ... ≤ bn
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

public class Task3_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first sequence length: ");
            int firstSize = scan.nextInt();
            System.out.println();
            ArrayList<Integer> firstSequence = new ArrayList<Integer>();
            System.out.println("Insert sequence elements:");

            for (int i = 0; i < firstSize; i++) {
                firstSequence.add(scan.nextInt());
            }
            System.out.println();

            System.out.print("Enter the second sequence length: ");
            int secondSize = scan.nextInt();
            System.out.println();
            ArrayList<Integer> secondSequence = new ArrayList<Integer>();
            System.out.println("Insert sequence elements:");

            for (int i = 0; i < secondSize; i++) {
                secondSequence.add(scan.nextInt());
            }
            System.out.println();

           firstSequence.addAll(0, secondSequence);
           Collections.sort(firstSequence);

            System.out.println(firstSequence);
        }
    }
}