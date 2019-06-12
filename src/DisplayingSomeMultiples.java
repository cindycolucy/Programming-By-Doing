import java.util.Scanner;

public class DisplayingSomeMultiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Enter a number...");
        n = scanner.nextInt();

        for(int i = 1; i <= 12; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }


    }
}
