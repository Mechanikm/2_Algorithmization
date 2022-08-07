import java.util.Scanner;

// Задана последовательность N вещественных чисел. 
// Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

public class Task1_6 {

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

            int sumPrimes = 0;
            if (size >= 2) {
                sumPrimes = sequence[1];
            }

            for (int i = 3; i <= size; i += 2) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    sumPrimes += sequence[(int) i - 1];
                    isPrime = false;
                }
            }
            System.out.println();
            System.out.println("The sum of prime numbers in this sequence is: " + sumPrimes);
        }
    }
}
