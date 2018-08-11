import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("What is your name?");
        name = scanner.next();

        System.out.println("Hello, " + name + ". What is your age?");
        age = scanner.nextInt();

        System.out.println("In five years you will be " + (age + 5) + ".");
        System.out.println("Five years ago you were " + (age - 5) + ".");
    }
}
