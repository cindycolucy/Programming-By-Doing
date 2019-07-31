import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists3 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            num.add(getNumbers());
        }
        System.out.println(num);
    }

        public static int getNumbers(){
            Random r = new Random();
            int x = 10 + r.nextInt(99);
            return x;
        }



        }

