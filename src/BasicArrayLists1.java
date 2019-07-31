import java.util.ArrayList;

public class BasicArrayLists1 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(-113);

        for (int i = 0; i < 10; i++){

            System.out.println("Slot " + i + " contains a " + num.get(0));

        }
    }
}
