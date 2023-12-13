package Recursion;

public class largestElements {
    public static int larg(int arr[], int n)
    {
        if(n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1],larg(arr, n-1));
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,50,60,7,8,9,10};
        int n = arr.length;
        System.out.println(larg(arr, n));
    }
}