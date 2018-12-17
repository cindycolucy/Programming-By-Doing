import java.util.Scanner;

public class WeeklyCalculator {

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cindy's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12,10,2003));
        System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
        System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
        System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
        System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
        System.out.println("10 13 2000 => " + weekday(10,13,2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();
        int yyyy = scanner.nextInt();

        System.out.println("You were born on " + weekday(mm,dd,yyyy) + "!");
    }


    public static String weekday( int mm, int dd, int yyyy )
    {
        int yy, total, remainder;
        String date = "";

        yy = 1900 - yyyy;

        total = yy / 4 + yy + dd + month_offset(mm);

        if ((is_leap(yyyy)) && (mm == 1 || mm == 2)){
            total = total - 1;

        }
        remainder = total % 7;

        weekday_name(remainder);

        date = weekday_name(remainder) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

        return date;
    }


    public static String month_name( int month )
    {
        String result;

        if(month == 1){
            result = "January";
        }
        else if (month == 2){
            result = "February";
        }
        else if (month == 3){
            result = "March";
        }
        else if (month == 4){
            result = "April";
        }
        else if (month == 5){
            result = "May";
        }
        else if (month == 6){
            result = "June";
        }
        else if (month == 7){
            result = "July";
        }
        else if (month == 8){
            result = "August";
        }
        else if (month == 9){
            result = "September";
        }
        else if (month == 10){
            result = "October";
        }
        else if (month == 11){
            result = "November";
        }
        else if (month == 12){
            result = "December";
        }
        else result = "error";

        return result;
    }

    public static String weekday_name(int weekday) {

        String result = "";

        if (weekday == 0) {
            result = "Sunday";
        }
        else if (weekday == 1) {
            result = "Monday";
        }
        else if (weekday == 2) {
            result = "Tuesday";
        }
        else if (weekday == 3) {
            result = "Wednesday";
        }
        else if (weekday == 4) {
            result = "Thursday";
        }
        else if (weekday == 5) {
            result = "Friday";
        }
        else if (weekday == 6) {
            result = "Saturday";
        } else result = "Error";

        return result;
    }

    public static int month_offset( int month )
    {
        int result = 0;

        if (month == 1){
            result = 1;
        }
        else if (month == 2){
            result = 4;
        }
        else if (month == 3){
            result = 4;
        }
        else if (month == 4){
            result = 0;
        }
        else if (month == 5){
            result = 2;
        }
        else if (month == 6){
            result = 5;
        }
        else if (month == 7){
            result = 0;
        }
        else if (month == 8){
            result = 3;
        }
        else if (month == 9){
            result = 6;
        }
        else if (month == 10){
            result = 1;
        }
        else if (month == 11){
            result = 4;
        }
        else if (month == 12){
            result = 6;
        }
        else result = -1;

        return result;
    }


    public static boolean is_leap( int year )
    {
        // years which are evenly divisible by 4 are leap years,
        // but years divisible by 100 are not leap years,
        // though years divisible by 400 are leap years
        boolean result;

        if ( year%400 == 0 )
            result = true;
        else if ( year%100 == 0 )
            result = false;
        else if ( year%4 == 0 )
            result = true;
        else
            result = false;

        return result;
    }
}
