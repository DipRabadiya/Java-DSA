package Hashing;

import java.util.HashSet;

public class allUniqueNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}