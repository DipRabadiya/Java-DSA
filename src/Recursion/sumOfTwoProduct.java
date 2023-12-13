package Recursion;

public class sumOfTwoProduct
{
    static int product(int one, int two)
    {
        if (one < two) {
            return product(two, one);
        }
        else if (two != 0) {
            return (one + product(one, two - 1));
        }
        else {
            return 0;
        }
    }
    public static void main (String[] args)
    {
        int one = 5, two = 2;
        System.out.println(product(one, two));
    }
}

