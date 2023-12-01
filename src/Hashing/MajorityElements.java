package Hashing;
import  java.util.*;
public class MajorityElements {
    public static void majorityElement(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,3,3,3,3,5};
        majorityElement(arr);
    }
}
