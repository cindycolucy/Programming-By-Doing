import java.util.Random;

public class BubbleSort {

    public static void bubble_sort( int[] a )
    {
        boolean swapped = true;

        int j = 0;

        int tmp;

        while (swapped) {

            swapped = false;

            j++;

            for (int i = 0; i < a.length - j; i++) {

                if (a[i] > a[i + 1]) {

                    tmp = a[i];

                    a[i] = a[i + 1];

                    a[i + 1] = tmp;

                    swapped = true;

                }

            }

        }
    }


//    public static void swap( int[] a , int i, int j )
//    {
//        for ( i = 0; i < a.length - 1; i ++ )
//        {
//            for ( j = i + 1; j < a.length; j ++ )
//            {
//                if( a[ i ] > a[ j ] )         //sorting into descending order
//                {
//                    int temp = a[ j ];   //swapping
//                    a[ j ] = a[ i ];
//                    a[ i ] = temp;
//                }
//            }
//        }
//    }


    public static void main( String[] args )
    {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for ( i=0; i<arr.length; i++ )
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Sort it
        bubble_sort( arr );

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for ( i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();
    }
}
