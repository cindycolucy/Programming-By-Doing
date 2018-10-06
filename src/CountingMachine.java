import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Enter an integer.");
        n = scanner.nextInt();
        System.out.println("Count to: " + n);

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }
}
