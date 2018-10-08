import java.util.Random;

public class BabyBlackjack {

    public static void main(String[] args) {

        Random r = new Random();

        int x = 1 + r.nextInt(10);
        int y = 1 + r.nextInt(10);
        int yourTotal = x + y;
        System.out.println("Your numbers are " + x + " and " + y + ".");
        System.out.println("Your total is " + yourTotal + ".");
        System.out.println();

        int a = 1 + r.nextInt(10);
        int b = 1 + r.nextInt(10);
        int dealerTotal = a + b;
        System.out.println("The dealer's numbers are " + a + " and " + b + ".");
        System.out.println("The dealer's total is " + dealerTotal + ".");
        System.out.println();

        if(yourTotal > dealerTotal){
            System.out.println("You win!");
        }
        else System.out.println("The dealer wins!");
    }
}
