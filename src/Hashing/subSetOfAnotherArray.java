package Hashing;

import java.util.HashSet;

public class subSetOfAnotherArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int arr1[] = {1,2,3};
        subset(arr,arr1);
    }
    public static void subset(int[] arr,int[] arr1){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0; i< arr1.length; i++){
            if(!set.contains(arr1[i])){
                System.out.println("Not subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
