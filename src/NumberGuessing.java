import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int i = 1 + r.nextInt(10);
        int guess;
        int tries = 1;

        System.out.println("Guess a number 1-10");
        guess = scanner.nextInt();

        while(i != guess) {
            System.out.println("Wrong, you lose, try again.");
            guess = scanner.nextInt();
            tries++;
        }
        System.out.println("You're right, the number was " + i + " and it only took you " + tries + " tries!");



    }
}
