public class BasicNestedLoops {

    public static void main(String[] args) {

        for(int a = 0; a <= 5; a++){

            System.out.print("\n");

            for (int b = 0; b <= 5; b++){

                System.out.print("(" + a + "," + b + ")");
            }
        }
    }
}
