package Hashing;

import java.util.*;
//4.Check if two arrays are equal or not.
public class equalORnot {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,4,7,0};
        int[] arr2 = {2,4,5,0,1,7};
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        if(arr1.length != arr2.length){
            System.out.println(false);
            return;
        }
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(int i : arr2){
            if(!map.containsKey(i)){
                System.out.println(false);
                return;
            }
            if(map.get(i) == 0){
                System.out.println(false);
                return;
            }
            count = map.get(i);
            map.put(i,count-1);
        }
        System.out.println(true);
    }
}