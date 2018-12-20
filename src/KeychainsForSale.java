import java.text.DecimalFormat;
import java.util.Scanner;

public class KeychainsForSale {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int current_qty = 0;
        double price = 10.00;
        int selection = 0;
        double tax = 0.0825;
        double shipping_order = 5.00;
        double shipping_keychain = 1.00;

        while (selection != 4) {

            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Welcome to Cindy's Keychains");
            System.out.println("Please select an option to continue:");
            System.out.println("1) Add keychains to order");
            System.out.println("2) Remove keychains from order");
            System.out.println("3) View current order");
            System.out.println("4) Checkout");

            selection = scanner.nextInt();

            if (selection == 1){
                current_qty = add_keychains(current_qty);
            }
            else if (selection == 2){
                current_qty = remove_keychains(current_qty);
            }
            else if (selection == 3){
                view_order(current_qty, price, tax, shipping_order, shipping_keychain);
            }
            else if (selection == 4){
                checkout(current_qty, price, tax, shipping_order, shipping_keychain);
            }
            else System.out.println("That is not a valid selection. Please try again.");
        }
    }

    public static int add_keychains(int current_qty){
        System.out.println("Adding keychains...");
        System.out.println("You have " + current_qty + " keychains. How many keychains do you want to add?");
        int add = scanner.nextInt();
        current_qty = current_qty + add;
        System.out.println("Your total is now " + current_qty + " keychains.");
        return current_qty;
    }

    public static int remove_keychains(int current_qty){
        System.out.println("Removing keychains...");
        System.out.println("You have " + current_qty + " keychains. How many keychains do you want to remove?");
        int remove = scanner.nextInt();
        current_qty = current_qty - remove;
        if(current_qty < 0){
            System.out.println("You cannot have a negative total.");
        }
        System.out.println("Your total is now " + current_qty + " keychains.");
        return current_qty;
    }

    public static void view_order(int current_qty, double price, double tax, double shipping_order, double shipping_keychain){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("Viewing order...");
        System.out.println("Keychains are $" + price + " each.");
        System.out.println("You have " + current_qty + " keychains in your order.");
        double subtotal = current_qty * price;
        System.out.println("Your subtotal is $" + subtotal);
        double total_with_tax = subtotal + subtotal * tax;
        System.out.println("Your total with tax is $" + numberFormat.format(total_with_tax));
        double shipping_total = shipping_order + (shipping_keychain * current_qty);
        System.out.println("Shipping charges are $" + shipping_total);
        System.out.println("Your grand total is $" + numberFormat.format((total_with_tax + shipping_total)));
    }

    public static void checkout(int current_qty, double price, double tax, double shipping_order, double shipping_keychain){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("Checking out...");
        System.out.println("What is your name?");
        String name = scanner.next();
        double subtotal = current_qty * price;
        double total_with_tax = subtotal + subtotal * tax;
        double shipping_total = shipping_order + (shipping_keychain * current_qty);
        System.out.println("Ok, " + name + ", your order is " + current_qty + " keychains at $" + price + " each.");
        System.out.println("Add on tax and shipping and you get a grand total of $" + numberFormat.format((total_with_tax + shipping_total)));
        System.out.println("Thank you for shopping at Cindy's Keychains.");
    }
}
