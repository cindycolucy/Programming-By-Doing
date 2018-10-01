public class MyModulusAnimation {

    public static void main( String[] args ) throws Exception
    {
        for (int i = 0; i < 80; i++ )
        {
            if ( i%10 == 0 )
                System.out.print(" C     \r");
            if ( i%10 == 1 )
                System.out.print(" Ci    \r");
            if ( i%10 == 2 )
                System.out.print(" Cin   \r");
            if ( i%10 == 3 )
                System.out.print(" Cind  \r");
            if ( i%10 == 4 )
                System.out.print(" Cindy \r");

            Thread.sleep(200);
        }

    }
}
