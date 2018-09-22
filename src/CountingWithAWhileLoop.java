import java.util.Scanner;

public class CountingWithAWhileLoop {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = scanner.nextLine();

        int n = 0;
        while ( n < 100 )
        {
            System.out.println( (n+10) + ". " + message );
            n+=10;
        }

    }
}
