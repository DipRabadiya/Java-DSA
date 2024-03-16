package Pattern;
import java.util.*;
public class allPattern {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = object.nextInt();
        int i,j;
        char ch='A';

////      * * * * *
////      * * * * *
////      * * * * *
////      * * * * *
////      * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////      *
////      * *
////      * * *
////      * * * *
////      * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=i)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////          * * * *
////            * * *
////              * *
////                *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////                *
////              * *
////            * * *
////          * * * *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=n-i+1)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        * * * *
////        * * *
////        * *
////        *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////             *
////           * * *
////         * * * * *
////       * * * * * * *
////     * * * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n*2-1;j++)
//            {
//                if(j>=n+1-i && j<=n-1+i)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        *********
////         *******
////          *****
////           ***
////            *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n*2-1;j++)
//            {
//                if(j>=i && j<=2*n-i)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        *
////        * *
////        *   *
////        *     *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || i==j || i==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *     *
////        *   *
////        * *
////        *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n-i+1 || i==1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////                    *
////                  * *
////                *   *
////              *     *
////            *       *
////          *         *
////        * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==n-i+1 || j==n || i==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////          *     *
////            *   *
////              * *
////                *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==i || j==n || i==1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *
////        *
////        *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || i==n || i==1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *
////        * * * * *
////        *
////        *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || i==1 || i==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *
////        * * * * *
////        *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || i==1 || i==n || i==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *       *
////        *       *
////        * * * * *
////        *       *
////        *       *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////            *
////            *
////            *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(i==1 || j==n/2+1 || i==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *       *
////        * *     *
////        *   *   *
////        *     * *
////        *       *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==j)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////                *
////        * * * * *
////                *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(i==1 || i==n || i==n/2+1 || j==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *       *
////        * * * * *
////        *       *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==1 || i==n/2+1 || i==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *           *
////        * *       *
////        * * *   *
////        * * * *
////        * * * * *
////        * * * * * *
////        * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=i ||j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * * * *
////          * * * * * *
////            * * * * *
////              * * * *
////            *   * * *
////          *       * *
////        *           *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=i ||j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * * * *
////        * * * * * *
////        * * * * *
////        * * * *
////        * * *   *
////        * *       *
////        *           *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1 || i==j)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *           *
////          *       * *
////            *   * * *
////              * * * *
////            * * * * *
////          * * * * * *
////        * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=n-i+1 || i==j)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *       *
////          *   *
////            *
////          *   *
////        *       *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==i || j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////            *
////            *
////            *
////            *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(i==1 || j==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * *
////        *     * *
////        *   *   *
////        * *     *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==1 || i==n || j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *     *     *
////          *   *   *
////            * * *
////        * * * * * * *
////            * * *
////          *   *   *
////        *     *     *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==i || j==n-i+1 || i==n/2+1 || j==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        1
////        2 2
////        3 3 3
////        4 4 4 4
////        5 5 5 5 5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=i)
//                {
//                    System.out.print(i+" ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 2 3 4 5
////        1 2 3 4
////        1 2 3
////        1 2
////        1
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print(j+" ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 2 3 4 5
////        2 3 4 5
////        3 4 5
////        4 5
////        5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print(i+j-1+" ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 2 3 4 5
////        * 2 3 4 5
////        * * 3 4 5
////        * * * 4 5
////        * * * * 5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<i)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 * * * *
////        2 2 * * *
////        3 3 3 * *
////        4 4 4 4 *
////        5 5 5 5 5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>i)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(i+" ");
//                }
//            }
//            System.out.println();
//        }
//
////        A
////        B C
////        D E F
////        G H I J
////        K L M N O
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=i)
//                {
//                    System.out.print(ch++ + " ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        A B C D E
////          F G H I
////            J K L
////              M N
////                O
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print(ch++);
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        A B C D E F G H
////        I J K L M N O
////        P Q R S T U
////        V W X Y Z
////        [ \ ] ^
////        _ ` a
////        b c
////        d
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print(ch++ + " ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////                A
////              B C
////            D E F
////          G H I J
////        K L M N O
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=n-i+1)
//                {
//                    System.out.print(ch++);
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////                1
////              2 2
////            3 3 3
////          4 4 4 4
////        5 5 5 5 5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=n-i+1)
//                {
//                    System.out.print(i);
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 1 1 1 1
////          2 2 2 2
////            3 3 3
////              4 4
////                5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print(i);
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 1 1 1 1
////        2 2 2 2
////        3 3 3
////        4 4
////        5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print(i+" ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * 5
////        * * * 4 5
////        * * 3 4 5
////        * 2 3 4 5
////        1 2 3 4 5
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }
//
////        1 2 3 4 5
////        1 2 3 4 *
////        1 2 3 * *
////        1 2 * * *
////        1 * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }
//
////        *       *
////        *       *
////        *       *
////        *       *
////        * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==n)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        2
////        2 4
////        2 4 6
////        2 4 6 8
////        2 4 6 8 10
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=i)
//                {
//                    System.out.print(j*2+ " ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * * * *
////        * *       * *
////        *   *   *   *
////        *     *     *
////        *   *   *   *
////        * *       * *
////        * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==1 || i==n || j==n-i+1 ||i==j)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        *           *
////        * *       * *
////        *   *   *   *
////        *     *     *
////        *   *   *   *
////        * *       * *
////        *           *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==1 || j==n || i==j || j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        * * * * * * *
////          *       *
////            *   *
////              *
////            *   *
////          *       *
////        * * * * * * *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(i==1 || i==n || i==j || j==n-i+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        2 4 6 8 10
////          4 6 8 10
////            6 8 10
////              8 10
////                10
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=i)
//                {
//                    System.out.print(" "+j*2);
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////        2 4 6 8 10 12 14
////        2 4 6 8 10 12
////        2 4 6 8 10
////        2 4 6 8
////        2 4 6
////        2 4
////        2
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j<=n-i+1)
//                {
//                    System.out.print(" "+j*2);
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////                10
////              8 10
////            6 8 10
////          4 6 8 10
////        2 4 6 8 10
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j>=n-i+1)
//                {
//                    System.out.print(" "+j*2);
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
////              *
////              *
////              *
////        * * * * * * *
////              *
////              *
////              *
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=n;j++)
//            {
//                if(j==n/2+1 || i==n/2+1)
//                {
//                    System.out.print("* ");
//                }
//                else
//                {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}