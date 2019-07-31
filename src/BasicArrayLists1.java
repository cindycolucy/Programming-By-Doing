import java.util.ArrayList;

public class BasicArrayLists1 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>(10);

        int n = 10;

        for(int i = 0; i < n; i++){
            num.add(-113);
        }

         for (int i = 0; i < num.size(); i++){

           System.out.println("Slot " + i + " contains a " + num.get(i));

        }
    }
}
