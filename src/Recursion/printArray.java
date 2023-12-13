package Recursion;

public class printArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        printArrays(arr,arr.length-1);
    }

    private static void printArrays(int[] arr, int n) {
        if(n==-1){
            return;
        }
        printArrays(arr,n-1);
        System.out.println(arr[n]);
    }
}
