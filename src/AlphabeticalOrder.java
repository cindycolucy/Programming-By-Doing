import java.util.Scanner;

public class AlphabeticalOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("What is your last name?");
        name = scanner.next();

        if(name.compareTo("Carswell") <= 0){
            System.out.println("You don't have long to wait.");
        }
        else if(name.compareTo("Jones") <= 0){
            System.out.println("That's not bad.");
        }
        else if(name.compareTo("Smith") <= 0){
            System.out.println("Looks like a bit of a wait.");
        }
        else if(name.compareTo("Young") <= 0){
            System.out.println("It's going to be a while.");
        }
        else System.out.println("Not going anywhere for a while.");

    }
}
