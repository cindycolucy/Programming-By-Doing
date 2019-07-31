import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            num.add(getNumbers());
        }
        System.out.println("Array List: " + num);
        System.out.println("Enter a value to find...");
        int value = scanner.nextInt();
        System.out.println("Value to find: " + value);

        for (int j = 0; j < num.size(); j++){
            if (num.get(j) == value) {
                System.out.println(value + " is found in the array list.");
            }
        }

    }
        public static int getNumbers () {

            Random r = new Random();
            int x = 1 + r.nextInt(50);
            return x;


        }

    }

