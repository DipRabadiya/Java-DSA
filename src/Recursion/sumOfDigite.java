package Recursion;


public class sumOfDigite {

    public static int sumofdigit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sumofdigit(n / 10));
    }

    public static void main(String args[])
    {
        int number = 62345;
        System.out.println(sumofdigit(number));
    }
}

