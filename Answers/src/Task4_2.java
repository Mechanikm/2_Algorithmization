import java.util.Scanner;

public class Task4_2 {

    // Написать метод(методы) для нахождения
    // наибольшего общего делителя четырех натуральных чисел.

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter A: ");
            int numberA = scan.nextInt();
            System.out.print("Enter B: ");
            int numberB = scan.nextInt();
            System.out.print("Enter C: ");
            int numberC = scan.nextInt();
            System.out.print("Enter D: ");
            int numberD = scan.nextInt();
            System.out.println();

            int answer = gcd(numberA, numberB, numberC, numberD);
            System.out.println("Least common multiple for A and B is: " + answer);
        }
    }

    private static int gcd(int a, int b, int c, int d) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}