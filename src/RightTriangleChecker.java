import java.util.Scanner;

public class RightTriangleChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("You will enter three numbers in ascending order. Enter your first number.");
        a = scanner.nextInt();

        System.out.println("Enter your second number.");
        b = scanner.nextInt();

        while(a > b){
            System.out.println("Sorry, " + a + " is greater than " + b + ". Try again.");
            b = scanner.nextInt();
        }

        System.out.println("Enter your third number.");
        c = scanner.nextInt();

        while(b > c) {
            System.out.println("Sorry, " + b + " is greater than " + c + ". Try again.");
            c = scanner.nextInt();
        }

        if((a*a) + (b*b) == (c*c)){
            System.out.println("Yes! " + a + ", " + b + ", and " + c + " create a right triangle");
        }
        else System.out.println("Sorry, " + a + ", " + b + ", and " + c + " do not create a right triangle.");



    }
}
