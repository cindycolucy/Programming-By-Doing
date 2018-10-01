import java.sql.SQLOutput;
import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random r = new Random();

        int roll1 = 0;
        int roll2 = 0;


        System.out.println("HERE COMES THE DICE...");

        do {
            roll1 = 1 + r.nextInt(6);
            roll2 = 1 + r.nextInt(6);
            System.out.println("First roll: " + roll1);
            System.out.println("Second roll: " + roll2);
            System.out.println("Total: " + (roll1 + roll2));

        } while (roll1 != roll2);

        // System.out.println("Doubles!");
    }
}
