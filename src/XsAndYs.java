public class XsAndYs {

    public static void main(String[] args) {

        System.out.println("x           y");
        System.out.println("---------------");

        for (double x = -10; x <= 10; x = x + .5) {
            double y = x * x;
            System.out.println(x + "      " + y);
        }
    }
}
