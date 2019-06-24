import java.util.Random;
import java.util.Scanner;

public class GradesInAnArrayAndFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What is your name (first last)?");
        String name = scanner.nextLine();

//        System.out.println("Please enter a file name (*.txt).");
//        String file = scanner.next();

        System.out.println(name);

        int a[] = new int[5];
        for(int j = 0; j < a.length; j++) {
            a[j] = 1 + r.nextInt(100);
                System.out.println("Grade " + (j+1) + ": " + a[j]);

            }


        }

        }
