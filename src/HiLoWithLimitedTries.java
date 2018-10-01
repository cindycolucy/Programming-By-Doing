import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = 1 + r.nextInt(100);

        System.out.println("Guess a number between 1-100.");
        int guess = scanner.nextInt();

        int tries = 0;

        while (guess != number && tries <= 7){
            if (guess < number){
                System.out.println("Too low. Guess again.");
                tries++;
                guess = scanner.nextInt();
            }
            if (guess > number){
                System.out.println("Too high. Guess again.");
                tries++;
                guess = scanner.nextInt();
            }
        }
        if (guess == number){
            System.out.println("Correct! The number was " + number + "!");
        }
        else if (tries >= 7){
            System.out.println("Too many tries, you lose! The number was " + number + ".");
        }

    }
}
