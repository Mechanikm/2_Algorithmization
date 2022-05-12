import java.util.ArrayList;
import java.util.Scanner;

public class Task3_1 {

    // Заданы два одномерных массива с различным количеством элементов и натуральное
    // число k.
    // Объединить их в один массив, включив второй массив между k-м и (k+1) - м
    // элементами первого,
    // при этом не используя дополнительный массив.

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first array length: ");
            int firstSize = scan.nextInt();
            System.out.println();
            ArrayList<Integer> firstArray = new ArrayList<Integer>();
            System.out.println("Insert array elements:");

            for (int i = 0; i < firstSize; i++) {
                firstArray.add(scan.nextInt());
            }
            System.out.println();

            System.out.print("Enter the second array length: ");
            int secondSize = scan.nextInt();
            System.out.println();
            ArrayList<Integer> secondArray = new ArrayList<Integer>();
            System.out.println("Insert array elements:");

            for (int i = 0; i < secondSize; i++) {
                secondArray.add(scan.nextInt());
            }
            System.out.println();

            System.out.println("Enter divider:");
            int divider = scan.nextInt();
            System.out.println();

            firstArray.addAll(divider, secondArray);

            System.out.println(firstArray);
        }
    }
}