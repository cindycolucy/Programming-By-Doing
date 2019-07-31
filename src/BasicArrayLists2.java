import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            num.add(getNumbers());
        }
        System.out.println("ArrayList: " + num);
    }

        public static int getNumbers(){
            Random r = new Random();
            int x = 1 + r.nextInt(100);
            return x;
        }



        }

