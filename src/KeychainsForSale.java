import java.util.Scanner;

public class KeychainsForSale {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int selection = 0;

        while (selection != 4) {

            System.out.println("Welcome to Cindy's Keychains");
            System.out.println("Please select an option to continue:");
            System.out.println("1) Add keychains to order");
            System.out.println("2) Remove keychains from order");
            System.out.println("3) View current order");
            System.out.println("4) Checkout");

            selection = scanner.nextInt();

            if (selection == 1){
                add_keychains();
            }
            if (selection == 2){
                remove_keychains();
            }
            if (selection == 3){
                view_order();
            }
            if (selection == 4){
                checkout();
            }
        }
    }

    public static void add_keychains(){
        System.out.println("Adding keychains...");
    }
    public static void remove_keychains(){
        System.out.println("Removing keychains...");
    }
    public static void view_order(){
        System.out.println("Viewing order...");
    }
    public static void checkout(){
        System.out.println("Checking out...");
    }
}
