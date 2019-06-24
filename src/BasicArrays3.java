import java.util.Random;

public class BasicArrays3 {

    public static void main(String[] args){
        Random r = new Random();

        int a[] = new int[1000];

        for(int i = 0; i < a.length; i++){
            a[i] = 10 + r.nextInt(90);

            System.out.print(a[i] + "\t");
        }
    }
}
