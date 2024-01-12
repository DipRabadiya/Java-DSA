package Hashing;

import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i] + " ");
            }else {
                set.add(arr[i]);
            }
        }
    }
}