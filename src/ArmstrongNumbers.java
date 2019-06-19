public class ArmstrongNumbers {

    public static void main(String[] args) {

        int num = 0;
        int ones = num % 10;
        int tens = num / 10;
        int hundreds = num / 100;

        for(num = 100; num <= 999; num++){
           if(((ones*ones*ones) + (tens*tens*tens) + (hundreds*hundreds*hundreds)) == num){
                System.out.println((num));
            }
        }
    }
}
