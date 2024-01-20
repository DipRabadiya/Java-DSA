package Pattern;
import java.util.*;
public class allPattern {
    public static void main(String[] args) {
        int i,j;
//        System.out.println("Enter a number:");
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}