import java.util.Random;

public class CopyingArrays {

    public static void main(String[] args){
        Random r = new Random();
        int x = 1 + r.nextInt(100);

        int a[] = new int[10];
        int b[] = new int[10];

        System.out.print("Array 1: ");

        for(int i = 0; i < a.length; i++){
            a[i] = 1 + r.nextInt(100);

            System.out.print(a[i] + "  ");
        }

        b = a;
        a[a.length - 1] = -7;
        System.out.println();

        System.out.print("Array 2: ");

        for(int j = 0; j < b.length; j++){
            System.out.print(b[j] + "  ");
        }
    }
}