import java.util.Random;
import java.util.Scanner;

public class FindingTheLargestNumberInAnArray {

    public static void main(String[] args) {

        Random r = new Random();

        System.out.print("Array: ");

        int a[] = new int[10];
        int largest = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + r.nextInt(100);
            System.out.print(a[i] + "  ");
            }

            for (int i = 0; i < a.length; i++) {
                if (largest < a[i]) {
                    largest = a[i];

                }
            }
        System.out.println();
        System.out.println(largest + " is the largest number in the array.");
        }


    }
