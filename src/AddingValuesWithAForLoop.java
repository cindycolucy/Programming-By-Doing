import java.util.Scanner;

public class AddingValuesWithAForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Please enter an integer and I will give you the sum of all numbers to that integer.");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum = (i*(i+1))/2;
        }
        System.out.println();
            System.out.println("The sum is " + sum + ".");
    }
}
