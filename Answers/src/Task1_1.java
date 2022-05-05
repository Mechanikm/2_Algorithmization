import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter array length: ");
            int size = scan.nextInt();
            System.out.println();
            int arrayA[] = new int[size];
            System.out.println("Insert array elements:");

            for (int i = 0; i < size; i++) {
                arrayA[i] = scan.nextInt();
            }

            System.out.println();
            System.out.println("Enter divider: ");
            int divider = scan.nextInt();
            System.out.println();

            int sum = 0;

            for (int i = 0; i < size; i++) {
                if (arrayA[i] % divider == 0) {
                    sum += arrayA[i];
                }
            }
            System.out.println("Sum of required elements is " + sum);
        }
    }
}