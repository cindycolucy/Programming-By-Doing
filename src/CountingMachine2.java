import java.util.Scanner;

public class CountingMachine2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Enter an integer.");
        a = scanner.nextInt();
        System.out.println("Enter a second integer.");
        b = scanner.nextInt();
        System.out.println("Enter a third integer.");
        c = scanner.nextInt();

        for(int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
    }
}
