import java.util.Scanner;

public class ARefresher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("What is your name?");
        name = scanner.next();

        if(name.equals ("Mitchell")){
            for(int i = 0; i < 5; i++){
                System.out.println(name);
            }
        }
        else{
            for(int i = 0; i < 10; i++){
                System.out.println(name);
            }
        }


    }
}
