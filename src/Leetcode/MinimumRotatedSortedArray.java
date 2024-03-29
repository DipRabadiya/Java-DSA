package Leetcode;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,2,3};
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[high]){
                low =mid+1;
            }else {
                high=mid;
            }
        }
        System.out.println(arr[low]);
    }
}
