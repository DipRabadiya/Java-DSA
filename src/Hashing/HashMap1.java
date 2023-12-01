package Hashing;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //add
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 150);
        //map.put("US", 50);

        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(entry.getValue())) {
                System.out.println(entry.getKey());
                return;
            }
        }

//        //update
//        map.put("China", 480);
//        System.out.println(map);
//
//        //search
//        if(map.containsKey("India")) {
//            System.out.println("Present");
//        } else {
//            System.out.println("Not Present");
//        }
//
//        //find value of key
//        System.out.println(map.get("China")); // key exists
//        System.out.println(map.get("china")); // key not exists
//
//        for(Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }

        //remove
//        map.remove("China");
//        System.out.println(map);
    }
}