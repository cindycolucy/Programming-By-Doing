import java.util.Scanner;

public class WeekdayName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day;
        String name;

        System.out.println("What is the day number?");

        day = scanner.nextInt();

        if(day == 0){
            name = "Sunday";
        } else if(day == 1){
            name = "Monday";
        } else if (day == 2){
            name = "Tuesday";
        } else if (day == 3){
            name = "Wednesday";
        } else if (day == 4){
            name = "Thursday";
        } else if (day == 5){
            name = "Friday";
        } else if (day == 6){
            name = "Saturday";
        } else name = "Error";

        System.out.println("Weekday 0: Sunday");
        System.out.println("Weekday 1: Monday");
        System.out.println("Weekday 2: Tuesday");
        System.out.println("Weekday 3: Wednesday");
        System.out.println("Weekday 4: Thursday");
        System.out.println("Weekday 5: Friday");
        System.out.println("Weekday 6: Saturday");

        System.out.println("Today is " + name + ".");
    }
}
