import java.util.Scanner;

public class HowOldAreYouSpecifically {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("What is your first name?");

        name = scanner.next();

        System.out.println("What is your age?");

        age = scanner.nextInt();

        if(age < 16){
            System.out.println("You can't drive, " + name + ".");
        } else if(age == 16 || age == 17){
            System.out.println("You can drive but you can't vote, " + name + ".");
        } else if(age >= 18 && age <= 24){
            System.out.println("You can vote but you can't rent a car, " + name + ".");
        } else System.out.println("You can do pretty much anything.");

    }
}
