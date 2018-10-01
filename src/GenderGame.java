import java.sql.SQLOutput;
import java.util.Scanner;

public class GenderGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String gender;
        String firstName;
        String lastName;
        int age;
        String married;

        System.out.println("What is your gender? <male> or <female>");
        gender = scanner.next();

        System.out.println("What is your first name?");
        firstName = scanner.next();

        System.out.println("What is your last name?");
        lastName = scanner.next();

        System.out.println("What is your age?");
        age = scanner.nextInt();

        if(gender.equals("female") && age >= 20) {
            System.out.println("Are you married? <yes> or <no>");
            married = scanner.next();

            if (married.equals("yes")) System.out.println("I shall call you Mrs. " + lastName);
            if (married.equals("no")) System.out.println("I shall call you Ms. " + lastName);
        }

        if(gender.equals("female") && age < 20) System.out.println("I shall call you " + firstName + " " + lastName);

        if(gender.equals("male") && age >= 20) System.out.println("I shall call you Mr. " + lastName);

        if(gender.equals("male") && age < 20) System.out.println("I shall call you " + firstName + " " + lastName);
    }
}
