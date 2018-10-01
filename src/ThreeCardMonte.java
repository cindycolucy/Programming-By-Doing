import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int ace = 1 + r.nextInt(3);

        System.out.println("##   ##   ##");
        System.out.println("##   ##   ##");
        System.out.println("1    2    3");
        System.out.println("Guess which card is the ace.");
        guess = scanner.nextInt();

        if(guess == ace){
            System.out.println("You win!");
            }
            else System.out.println("You lose!");

        if(ace == 1){
            System.out.println("AA   ##   ##");
            System.out.println("AA   ##   ##");
            System.out.println("1    2    3");
        }
        if(ace == 2){
            System.out.println("##   AA   ##");
            System.out.println("##   AA   ##");
            System.out.println("1    2    3");
        }
        if(ace == 3){
            System.out.println("##   ##   AA");
            System.out.println("##   ##   AA");
            System.out.println("1    2    3");
        }
    }
}
