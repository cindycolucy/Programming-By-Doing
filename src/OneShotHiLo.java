import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int number = 1 + r.nextInt(100);

        System.out.println("Guess a number 1-100.");
        guess = scanner.nextInt();

        if(guess == number){
            System.out.println("Correct! You win!");
        }
        else if(guess < number){
            System.out.println("Sorry, too low. The number was " + number + ".");
        }
        else System.out.println("Sorry, too high. The number was " + number + ".");


    }
}
