import java.util.Scanner;

public class ARefresher2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("What is your name?");
        name = scanner.next();

        int loop = 10;

        if (name.equals("Mitchell")) {
            loop = 5;
        }

        for (int i = 0; i < loop; i++) {
            System.out.println(name);
        }
    }
}


