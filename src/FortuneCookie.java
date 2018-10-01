import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {

        Random r = new Random();

        int choice = 1 + r.nextInt(6);

        if(choice == 1){
            System.out.println("Good things are in your future.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
        if(choice == 2){
            System.out.println("You will have great wealth.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
        if(choice == 3){
            System.out.println("Love is right around the corner.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
        if(choice == 4){
            System.out.println("A move is in your future.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
        if(choice == 5){
            System.out.println("You will sit by Lisa Mercer at the game.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
        if(choice == 6){
            System.out.println("The Rams will win.");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54) + " - ");
            System.out.print(1 + r.nextInt(54));
        }
    }
}
