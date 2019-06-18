public class MoreNumberPuzzles {

    public static void main(String[] args) {

        for (int a = 10; a <= 56; a++) {

            int b = a % 10;
            int c = a / 10;
            int sum = b + c;
            if(sum > 10){
               System.out.println(a);

          }
       }
        System.out.println("*******************");

        for (int num = 10; num <= 99; num++){

            int ones = num % 10;
            int tens = num / 10;
            int sum = ones + tens;
            int reverse = (ones * 10) + tens;
            int diff = num - reverse;
            if(sum == diff){
                System.out.println(num);
            }
        }
    }
}
