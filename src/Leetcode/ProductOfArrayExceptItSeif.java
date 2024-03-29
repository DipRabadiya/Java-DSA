package Leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptItSeif {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n=arr.length;
        int product=1;
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = product;
            product *= arr[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            arr1[i] *= product;
            product *= arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
