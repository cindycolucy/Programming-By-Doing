import java.util.Scanner;

public class ADumbCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double first;
        double second;
        double third;
        double total;

        System.out.println("Name a number.");
        first = scanner.nextDouble();

        System.out.println("Name another number.");
        second = scanner.nextDouble();

        System.out.println("Name a third number.");
        third = scanner.nextDouble();

        total = (first + second + third) / 2;

        System.out.println("(" + first + " + " + second + " + " + third + ") / 2 = " + total);




    }
}
