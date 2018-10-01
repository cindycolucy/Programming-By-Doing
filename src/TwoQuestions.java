import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoQuestions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer1;
        String answer2;

        System.out.println("TWENTY QUESTIONS! Well, actually two questions...");
        System.out.println("Think of an object and I will guess it by asking two questions...");
        System.out.println("Question 1: Animal, vegetable or mineral?");
        answer1 = scanner.next();
        System.out.println("Question 2: Is it bigger than a bread box?");
        answer2 = scanner.next();

        if(answer1.equals("animal") && answer2.equals("no")){
            System.out.println("You're thinking of a squirrel.");
        }
        if(answer1.equals("vegetable") && answer2.equals("no")){
            System.out.println("You're thinking of a carrot.");
        }
        if(answer1.equals("mineral") && answer2.equals("no")){
            System.out.println("You're thinking of a paper clip.");
        }

        if(answer1.equals("animal") && answer2.equals("yes")){
            System.out.println("You're thinking of a moose.");
        }
        if(answer1.equals("vegetable") && answer2.equals("yes")){
            System.out.println("You're thinking of a watermelon.");
        }
        if(answer1.equals("mineral") && answer2.equals("yes")){
            System.out.println("You're thinking of a Camero.");
        }
    }
}
