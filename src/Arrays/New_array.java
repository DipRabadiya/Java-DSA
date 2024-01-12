package Arrays;

import java.util.*;

public class New_array {
    public static void main(String[] args){
        int[] arr = {2,5,8,6};
        int n=arr.length;
        int i;
        int arr1[]=new int[n*2];
        for(i=0;i<n;i++){
            arr1[i]=arr[i];
            arr1[i+n]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}