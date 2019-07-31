import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            num.add(getNumbers());
        }

        ArrayList<Integer> num1 = new ArrayList<Integer>(num);

        num.set(9, -7);

        System.out.println("Array List 1: " + num);
        System.out.println("Array List 2: " + num1);

        }

    public static int getNumbers() {
        Random r = new Random();
        int x = 1 + r.nextInt(100);
        return x;
    }


}

