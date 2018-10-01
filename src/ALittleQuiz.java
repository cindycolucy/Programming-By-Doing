import java.sql.SQLOutput;
import java.util.Scanner;

public class ALittleQuiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int answer;
        int score = 0;

        System.out.println("What is the capital of Ohio?");
        System.out.println("1. Cleveland");
        System.out.println("2. Cincinnati");
        System.out.println("3. Columbus");

        answer = scanner.nextInt();

        if(answer == 1 || answer == 2){
            System.out.println("Wrong!");
        }
        if(answer == 3){
            System.out.println("Correct!");
            score++;
        }
        System.out.println("Total score = " + score);

        System.out.println("What is the name of my oldest son?");
        System.out.println("1. Charlie");
        System.out.println("2. Atticus");
        System.out.println("3. Max");

        answer = scanner.nextInt();

        if(answer == 3 || answer == 2){
            System.out.println("Wrong!");
        }
        if(answer == 1){
            System.out.println("Correct!");
            score++;
        }
        System.out.println("Total score = " + score);

        System.out.println("What car company took all cars but one out of it's line?");
        System.out.println("1. Chevy");
        System.out.println("2. Ford");
        System.out.println("3. Toyota");

        answer = scanner.nextInt();

        if(answer == 1 || answer == 3){
            System.out.println("Wrong!");
        }
        if(answer == 2){
            System.out.println("Correct!");
            score++;
        }
        System.out.println("Total score = " + score);
    }
}
