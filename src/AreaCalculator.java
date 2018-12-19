import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        while (answer != 5) {

            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("You tell me the shape data and I will calculate the area.");
            System.out.println("Which shape would you like to calculate?");
            System.out.println("1) Circle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Triangle");
            System.out.println("5) Quit");

            answer = scanner.nextInt();

            if (answer == 1) {
                System.out.println("What is the radius of the circle?");
                int radius = scanner.nextInt();
                System.out.println("The area of the circle is " + area_circle(radius));
            }
            if (answer == 2) {
                System.out.println("What is the length of the rectangle?");
                int length = scanner.nextInt();
                System.out.println("What is the width of the rectangle?");
                int width = scanner.nextInt();
                System.out.println("The area of the rectangle is " + area_rectangle(length, width));
            }
            if (answer == 3) {
                System.out.println("What is the length of the side of the square?");
                int side = scanner.nextInt();
                System.out.println("The area of the square is " + area_square(side));
            }
            if (answer == 4) {
                System.out.println("What is the base of the triangle?");
                int base = scanner.nextInt();
                System.out.println("What is the height of the triangle?");
                int height = scanner.nextInt();
                System.out.println("The area of the triangle is " + area_triangle(base, height));
            }
        }
    }

    public static double area_circle( int radius ){
        double result = Math.PI * radius * radius;
        return result;
    }

    public static int area_rectangle( int length, int width ){
        int result = length * width;
        return result;
    }

    public static int area_square( int side ){
        int result = side * side;
        return result;
    }

    public static double area_triangle( int base, int height ){
        double result = .5 * (base * height);
        return result;
    }
}
