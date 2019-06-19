import java.util.Scanner;

public class MoreNumberPuzzles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int selection;
        do {
            System.out.println("Please choose an option...");
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");

            selection = scanner.nextInt();

            int sum = 0;
            int num = 0;

            if (selection == 1) {
                fifty_six(sum);
            }
            if (selection == 2) {
                number_puzzle(num);
            }
        }
        while (selection != 3);
    }

    public static int fifty_six(int sum) {

        for (int a = 10; a <= 56; a++) {

            int b = a % 10;
            int c = a % 100 / 10;
            sum = b + c;
            if (sum > 10) {
                System.out.println(a);

            }

        }
        return sum;
    }

    public static int number_puzzle(int num) {

        for (num = 10; num <= 99; num++) {

            int ones = num % 10;
            int tens = num / 10;
            int sum = ones + tens;
            int reverse = (ones * 10) + tens;
            int diff = num - reverse;
            if (sum == diff) {
                System.out.println(num);
            }
        }
        return num;
    }

}
