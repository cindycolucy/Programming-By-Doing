import java.util.Scanner;

public class BabyNim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pileA = 5;
        int pileB = 5;
        int pileC = 5;

        String pile = "";
        int remove = 0;

        System.out.println("Welcome to my game. You start with 3 piles of coins: ");
        System.out.println("Pile A = " + pileA + "  Pile B = " + pileB + "  Pile C = " + pileC);
        System.out.println("You will keep removing coins until they all have no coins.");

        while(pileA > 0 || pileB > 0 || pileC > 0){
            System.out.println("Which pile would you like to remove from?");
            pile = scanner.next();
            System.out.println("How many coins would you like to remove?");
            remove = scanner.nextInt();
            if(pile.equals("A")){
                pileA = pileA - remove;
            } else if(pile.equals("B")){
                pileB = pileB - remove;
            } else pileC = pileC - remove;
            System.out.println("Pile A = " + pileA + "  Pile B = " + pileB + "  Pile C = " + pileC);
        }
        System.out.println("All piles are empty, you win!");
    }
}
