import java.util.Scanner;

public class Task1_2 {

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
            System.out.println("Enter number for compare: ");
            int compareNumber = scan.nextInt();
            System.out.println();

            int count = 0;

            for (int i = 0; i < size; i++) {
                if (sequence[i] > compareNumber) {
                    sequence[i] = compareNumber;
                    count++;
                }
            }
            System.out.println("Your sequence is now: ");

            for (int i : sequence) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Quantity of replaced elements is " + count);
        }
    }
}