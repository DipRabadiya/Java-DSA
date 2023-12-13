package Hashing.HashMapM;

import java.util.*;
public class HashSetS{
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,1,1,0,0,0,9,6,6,6};
        int[] arr2 = {4,6,1};

        HashSet <Integer> Hashset = new HashSet<>();
        help Obj =new help();

        Obj.printU(arr1);

        Obj.subset(arr2);

        Obj.CountF(arr1);

        int n=12;
        Obj.pair(arr1,n);

        Obj.frequent_element(arr1);

        Obj.arraysem(arr1,arr2);

        Obj.printD(arr1);

        Obj.printU(arr1);
    }

}


class help{
    HashSet <Integer> Hashset = new HashSet<>();
    HashMap <Integer , Integer> Hashmap =new HashMap<>();
    public void printU(int[] arr1){
        for(int i=0; i<arr1.length; i++){
            Hashset.add(arr1[i]);
        }
        for(int V : Hashset){
            System.out.print(V + " ");
        }
        System.out.println();
    }
    public void subset(int[] arr2){
        for(int i=0; i< arr2.length; i++){
            if(!Hashset.contains(arr2[i])){
                System.out.println("Not subset");
                return;
            }
        }
        System.out.println("subset");
    }

    public void CountF(int[] arr1) {
        for(int i=0; i< arr1.length; i++){
            if(Hashmap.containsKey(arr1[i])) {
                int oldf = Hashmap.get(arr1[i]);
                Hashmap.put(arr1[i], oldf + 1);
            }else {
                Hashmap.put(arr1[i],1);
            }
        }

        for(Map.Entry e : Hashmap.entrySet()){
            System.out.print(e.getKey() + " :- " + e.getValue());
            System.out.println();
        }
    }

    public void pair(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            int rem = sum - arr[i];
            if (Hashmap.containsKey(rem)) {
                int count = Hashmap.get(rem);

                for (int j = 0; j < count; j++)
                    System.out.print("(" + rem + ", " + arr[i] + ")" + "\n");
            }
            if (Hashmap.containsKey(arr[i])) {
                Hashmap.put(arr[i], Hashmap.get(arr[i]) + 1);
            }
            else {
                Hashmap.put(arr[i], 1);
            }
        }

        for(int i=0; i< arr.length; i++){
            int key = sum - arr[i];
            if(Hashmap.containsKey(key)){
                System.out.print(true);
                return;
            }
            Hashmap.put(arr[i],i);
        }
        System.out.print(false);
    }

    public void frequent_element(int[] arr) {
        for(int i=0; i< arr.length; i++){
            if(Hashmap.containsKey(arr[i])){
                Hashmap.put(arr[i], Hashmap.get(arr[i])+1);
            }else {
                Hashmap.put(arr[i], 1);
            }
        }

        int maxKey = 0;
        int maxValue = 0;
        for(Map.Entry<Integer,Integer> me : Hashmap.entrySet()){
            if(me.getValue() > maxValue){
                maxKey = me.getKey();
                maxValue = me.getValue();
            }
        }
        System.out.println(maxKey);

    }

    public void arraysem(int[] arr1, int[] arr2) {
        int count = 0;
        if(arr1.length != arr2.length){
            System.out.println(false);
            return;
        }
        for(int i : arr1){
            Hashmap.put(i,Hashmap.getOrDefault(i,0) + 1);
        }


        for(int i : arr2){
            if(!Hashmap.containsKey(i)){
                System.out.println(false);
                return;
            }
            if(Hashmap.get(i) == 0){
                System.out.println(false);
                return;
            }
            count = Hashmap.get(i);
            Hashmap.put(i,count-1);
        }
        System.out.println(true);
    }

    public void printD(int[] arr) {

        //HashMap
        for(int i=0; i< arr.length; i++){
            if(Hashmap.containsKey(arr[i])){
                Hashmap.put(arr[i], Hashmap.get(arr[i])+1);
            }else {
                Hashmap.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> me : Hashmap.entrySet()){
            if(me.getValue() > 1){
                System.out.println(me.getKey());
            }
        }

        //HashSet
        for(int i=0; i< arr.length; i++){
            if(Hashset.contains(arr[i])){
                System.out.print(arr[i] + " ");
            }else {
                Hashset.add(arr[i]);
            }
        }
    }
}