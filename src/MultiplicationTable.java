public class MultiplicationTable {

    public static void main(String[] args) {


        for(int x = 1; x <= 12; x++){

            System.out.print(x + "  |       ");

            for(int y = 1; y <= 12; y++){

                System.out.print(x*y + "        ");


            }
            System.out.print("\n");
        }
    }
}
