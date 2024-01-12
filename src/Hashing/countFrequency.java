package Hashing;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,4,3};
        CountF(arr);

    }
    public static void CountF(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])) {
                int oldf = map.get(arr[i]);
                map.put(arr[i], oldf + 1);
            }else {
                map.put(arr[i],1);
            }
        }

        for(Map.Entry e : map.entrySet()){
            System.out.print(e.getKey() + " :- " + e.getValue());
            System.out.println();
        }
    }
}