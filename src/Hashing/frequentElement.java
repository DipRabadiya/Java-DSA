package Hashing;

import java.util.HashMap;
import java.util.Map;

public class frequentElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,3,4,5,6};
        frequent_element(arr);
    }
    public static void frequent_element(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i< arr.length; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//            }else {
//                map.put(arr[i], 1);
//            }
//        }
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
//
//        for(Map.Entry me : map.entrySet()){
//            System.out.println(me);
//        }

        int maxKey = 0;
        int maxValue = 0;
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getValue() > maxValue){
                maxKey = me.getKey();
                maxValue = me.getValue();
            }
        }
        System.out.println(maxKey);
    }
}