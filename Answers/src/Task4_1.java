import java.util.Scanner;

public class Task4_1 {

    // Написать метод(методы) для нахождения наибольшего общего делителя и
    // наименьшего общего кратного двух
    // натуральных чисел: НОК(А, В) = A * B / (НОД (A, B))

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter A: ");
            int numberA = scan.nextInt();
            System.out.print("Enter B: ");
            int numberB = scan.nextInt();
            System.out.println();

            int answer = lcm(numberA, numberB);
            System.out.println("Least common multiple for A and B is: " + answer);
        }
    }

    private static int gcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int lcm(int a, int b) {

        int lcm = a * b / gcd(a, b);

        return lcm;
    }
}