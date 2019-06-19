public class ArmstrongNumbers {

    public static void main(String[] args) {

        for(int num = 100; num <= 999; num++){

            int ones = num % 10;
            int tens = num % 100 / 10;
            int hundreds = num / 100;

            if(((ones*ones*ones) + (tens*tens*tens) + (hundreds*hundreds*hundreds)) == num){
                System.out.println((num));
            }
        }
  }
}
