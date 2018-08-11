import java.sql.SQLOutput;
import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("What is your name?");
        name = scanner.next();

        System.out.println("Hello, " + name + ". What is your age?");
        age = scanner.nextInt();

        System.out.println("Ah, " + age + ". That's not old at all. What is your salary?");
        salary = scanner.nextDouble();

        System.out.println(salary + "! You make more than me!");

    }
}
