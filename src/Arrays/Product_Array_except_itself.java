package Arrays;

import java.util.Arrays;

public class Product_Array_except_itself {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];
        int n = arr.length;
        //Arrays.fill(arr1,0);
        int i,temp=1;
        for (i = 0; i < n; i++) {
            arr1[i] = temp;
            temp *= arr[i];
        }
        temp=1;
        for (i = n - 1; i >= 0; i--) {
            arr1[i] *= temp;
            temp *= arr[i];
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}