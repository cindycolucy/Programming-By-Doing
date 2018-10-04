import java.util.Scanner;

public class SafeSquareRoot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n;

        System.out.println("Enter a positive number.");
        n = scanner.nextDouble();

        while(n < 0){
            System.out.println("No, silly, that's not a positive number, try again.");
            n = scanner.nextDouble();
        }

        double squareRoot = Math.sqrt(n);

        System.out.println("The square root of " + n + " is " + squareRoot + ".");


    }
}
