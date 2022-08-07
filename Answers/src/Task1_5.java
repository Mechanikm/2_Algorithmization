import java.util.Scanner;

// Даны целые числа а1 ,а2  ,..., аn  . 
// Вывести на печать только те числа, для которых аi > i.

public class Task1_5 {

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

            System.out.println();
            System.out.print("Old sequence: ");

            for (int i = 0; i < sequence.length; i++) {
                System.out.print(sequence[i] + " (" + (i + 1) + ") ");
            }
            
            System.out.println();
            System.out.print("New sequence: ");

            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] > (i + 1)) {
                    System.out.print(sequence[i] + " ");
                }
            }
        }
    }
}
