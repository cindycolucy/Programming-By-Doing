import java.util.Scanner;

public class TwoMoreQuestions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer1;
        String answer2;

        System.out.println("Welcome to the Two Question Game");
        System.out.println("You think of an object and I will tell you what it is based on two questions.");
        System.out.println("Ready...");
        System.out.println("Question 1: Does it belong <inside>, <outside> or <both>?");
        answer1 = scanner.next();
        System.out.println("Question 2: Is it alive? <yes> or <no>");
        answer2 = scanner.next();

        if (answer1.equals("inside") && answer2.equals("yes")) {
            System.out.println("It's a houseplant!");
        }
        if (answer1.equals("outside") && answer2.equals("yes")) {
            System.out.println("It's a bison!");
        }
        if (answer1.equals("both") && answer2.equals("yes")) {
            System.out.println("It's a dog!");
        }
        if (answer1.equals("inside") && answer2.equals("no")) {
            System.out.println("It's a shower curtain!");
        }
        if (answer1.equals("outside") && answer2.equals("no")) {
            System.out.println("It's a billboard!");
        }
        if (answer1.equals("both") && answer2.equals("no")) {
            System.out.println("It's a cell phone!");
        }
    }
}
