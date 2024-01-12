package Arrays;

import java.util.Arrays;

public class Alternative_array {
    public static void main(String[] args){
        int[] arr1 = {1,3,4,5,7};
        int[] arr2 = {2,4,6,5,8};
        int n=arr1.length;
        int[] arr3=new int[2*n];
        int ind =0;
        for(int i=0;i<n;i++){
            arr3[ind++]=arr1[i];
            arr3[ind++]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}