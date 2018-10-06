import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int count = 0;

        System.out.println("Enter a number and I will show you the Collatz Sequence.");
        n = scanner.nextInt();

        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
            }
            else n = 3 * n + 1;
            System.out.println(n);
            count++;
        }
        System.out.println("Terminated after " + count + " steps.");

    }
}
