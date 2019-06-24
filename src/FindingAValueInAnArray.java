import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Array: ");

        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + r.nextInt(50);
            System.out.print(a[i] + "  ");
        }
            System.out.println();
            System.out.println("Enter a number ");
            int num = scanner.nextInt();

            for (int i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    System.out.println(num + " is in the array.");
                }
            }

        }


    }
