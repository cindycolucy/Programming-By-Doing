import java.sql.SQLOutput;
import java.util.Scanner;

public class Nim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pileA = 5;
        int pileB = 5;
        int pileC = 5;

        String pile = "";
        int remove = 0;

        String player1 = "";
        String player2 = "";
        String currentPlayer = "";

        System.out.println("Player 1, what is your name?");
        player1 = scanner.next();
        System.out.println("Player 2, what is your name?");
        player2 = scanner.next();

        System.out.println("Welcome to my game. You start with 3 piles of coins: ");
        System.out.println("Pile A = " + pileA + "  Pile B = " + pileB + "  Pile C = " + pileC);
        System.out.println("You will keep removing coins until they all have no coins. The last person to remove a coin loses.");

        while(pileA > 0 || pileB > 0 || pileC > 0){
            System.out.println(player1 + ", which pile would you like to remove from?");
            pile = scanner.next();
            System.out.println(player1 + ", how many coins would you like to remove?");
            remove = scanner.nextInt();
            if(pile.equals("A")){
                pileA = pileA - remove;
            } else if(pile.equals("B")){
                pileB = pileB - remove;
            } else pileC = pileC - remove;
            currentPlayer = player1;

            System.out.println("Pile A = " + pileA + "  Pile B = " + pileB + "  Pile C = " + pileC);
            System.out.println(player2 + ", which pile would you like to remove from?");
            pile = scanner.next();
            System.out.println(player2 + ", how many coins would you like to remove?");
            remove = scanner.nextInt();
            if(pile.equals("A")){
                pileA = pileA - remove;
            } else if(pile.equals("B")){
                pileB = pileB - remove;
            } else pileC = pileC - remove;
            currentPlayer = player2;

            System.out.println("Pile A = " + pileA + "  Pile B = " + pileB + "  Pile C = " + pileC);
        }
        if(pileA <= 0 && pileB <= 0 && pileC <= 0) {
            System.out.println("All piles are empty, " + currentPlayer + ", you lose!");
        }
    }
}
