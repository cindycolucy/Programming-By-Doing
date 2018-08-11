import java.util.Scanner;

public class MoreUserInputOfData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        int grade;
        int studentId;
        String login;
        double gpa;

        System.out.println("What is your first name?");
        firstName = scanner.next();

        System.out.println("What is your last name?");
        lastName = scanner.next();

        System.out.println("What is your grade (9-12)?");
        grade = scanner.nextInt();

        System.out.println("What is your student ID?");
        studentId = scanner.nextInt();

        System.out.println("What is your login?");
        login = scanner.next();

        System.out.println("What is your GPA (0.0-4.0)?");
        gpa = scanner.nextDouble();

        System.out.println("Your Information:");
        System.out.println("Login: " + login);
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);



    }
}
