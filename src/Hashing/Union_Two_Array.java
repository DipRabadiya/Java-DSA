package Hashing;
import java.util.*;

import static java.lang.reflect.Array.set;

public class Union_Two_Array {
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        for(int j=0;j<arr1.length;j++) {
            set.add(arr1[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9,2,10};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }
}