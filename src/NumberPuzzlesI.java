public class NumberPuzzlesI {

    public static void main(String[] args) {

        for(int x = 10; x < 100; x++){

            for(int y = 10; y < 100; y++){

                if(x + y == 60 && y - x == 14){

                    System.out.println(x + "    " + y);
                }
            }
        }
    }
}
