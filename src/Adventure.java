import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String q1;
        String q2;
        String q3;
        String q4;
        String q5;

        System.out.println("Cindy's Lame Adventure");

        System.out.println("You enter a large, beautiful house. Would you like to go into the <kitchen> or <upstairs>?");
        q1 = scanner.next();

        if(q1.equals("kitchen")){
            System.out.println("You see a refridgerator and a sink full of dirty dishes. Do you open the <fridge> or do the <dishes>?");
            q2 = scanner.next();
            if(q2.equals("dishes")) System.out.println("You're a nice person, you win!");
            if(q2.equals("fridge"))System.out.println("You see a banana cream pie. Do you eat it? <yes> or <no>");
                q3 = scanner.next();
                if(q3.equals("yes"))System.out.println("You get sick and die!");
                    if(q3.equals("no")) System.out.println("You win!");
                    }

        if(q1.equals("upstairs")){
            System.out.println("You see a door that is ajar, do you open it? <yes> or <no>");
            q4 = scanner.next();
            if(q4.equals("no")) System.out.println("You're boring, you lose!");
            if(q4.equals("yes")) System.out.println("You find a pile of money, you win!");
        }
    }
}
