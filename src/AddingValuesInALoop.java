import java.util.Scanner;

public class AddingValuesInALoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will total your numbers until you enter a zero.");
        System.out.println("Enter your first number.");

        int num = scanner.nextInt();
        int total = num;

        while (num != 0){
            System.out.println("Enter your next number.");
            System.out.println("Your total is " + total + ".");
            num = scanner.nextInt();
            total = total + num;

        }
        System.out.println("You entered a zero. Your grand total was " + total + ".");
    }
}
