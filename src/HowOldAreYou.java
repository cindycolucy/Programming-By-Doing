import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("What is your name?");

        name = scanner.next();

        System.out.println("What is your age?");

        age = scanner.nextInt();

        if(age < 16){
            System.out.println("You can't drive.");
        }
        if(age < 18){
            System.out.println("You can't vote.");
        }
        if(age < 25){
            System.out.println("You can't rent a car.");
        }
        if(age >= 25){
            System.out.println("You can do anything that's legal.");
        }

    }
}
