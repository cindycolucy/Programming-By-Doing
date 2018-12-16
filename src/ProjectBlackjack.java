import java.util.Random;
import java.util.Scanner;

public class ProjectBlackjack {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerCard1 = 0;
        int playerCard2 = 0;
        int playerCard3 = 0;
        int playerCard4 = 0;
        int playerCard5 = 0;
        int playerTotal = 0;
        int dealerCard1 = 0;
        int dealerCard2 = 0;
        int dealerCard3 = 0;
        int dealerCard4 = 0;
        int dealerCard5 = 0;
        int dealerTotal = 0;

        System.out.println("Let's play some blackjack!");

        playerCard1 = 2 + r.nextInt(11);
        System.out.println("Player's first card is: " + playerCard1);

        playerCard2 = 2 + r.nextInt(11);
        System.out.println("Player's second card is: " + playerCard2);
        playerTotal = playerCard1 + playerCard2;
        System.out.println("Player's total is " + playerTotal);
        System.out.println("");

        dealerCard1 = 2 + r.nextInt(11);
        System.out.println("Dealer's first card is: " + dealerCard1);

        dealerCard2 = 2 + r.nextInt(11);
        System.out.println("Dealer's second card is hidden.");
        dealerTotal = dealerCard1 + dealerCard2;
        System.out.println("");

        System.out.println("Does the player want to hit?");
        String answer = scanner.next();
        if(answer.equals("yes")) {
            playerCard3 = 2 + r.nextInt(11);
            System.out.println("Player's next card is " + playerCard3);
            playerTotal = playerTotal + playerCard3;
            System.out.println("Player's total is " + playerTotal);
        }
        if(answer.equals("no")){
            System.out.println("Player's total is " + playerTotal);

        }
        if(dealerTotal < 16){
            System.out.println("Dealer hits.");
            dealerCard3 = 2 + r.nextInt(11);
            dealerTotal = dealerTotal + dealerCard3;
        }
        else System.out.println("Dealer stays.");

        if(dealerTotal > 21){
            System.out.println("Dealer is bust, player wins.");
        }
        if(playerTotal > 21){
            System.out.println("Player is bust, dealer wins.");
        }

        System.out.println("Does the player want to hit?");
        answer = scanner.next();
        if(answer.equals("yes")) {
            playerCard4 = 2 + r.nextInt(11);
            System.out.println("Player's next card is " + playerCard4);
            playerTotal = playerTotal + playerCard4;
            System.out.println("Player's total is " + playerTotal);
        }

        if(dealerTotal < 16) {
            System.out.println("Dealer hits.");
            dealerCard4 = 2 + r.nextInt(11);
        }
        else System.out.println("Dealer stays.");

        System.out.println("Does the player want to hit?");
        answer = scanner.next();
        if(answer.equals("yes")) {
            playerCard5 = 2 + r.nextInt(11);
            System.out.println("Player's next card is " + playerCard5);
            playerTotal = playerTotal + playerCard5;
            System.out.println("Player's total is " + playerTotal);
        }
        if(dealerTotal < 16) {
            System.out.println("Dealer hits.");
            dealerCard5 = 2 + r.nextInt(11);
        }
        else System.out.println("Dealer stays.");

        System.out.println("Player's total is " + playerTotal);
        System.out.println("Dealer's total is " + dealerTotal);

        if(playerTotal > dealerTotal){
            System.out.println("Player wins!");
        }
        else System.out.println("Dealer wins!");







    }
}
