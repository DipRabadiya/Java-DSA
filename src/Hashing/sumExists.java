package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class sumExists {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, -1, 5};
        int sum = 7;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int key = sum - arr[i];
            if(map.containsKey(key)){
                System.out.print(true);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.print(false);
    }
}
