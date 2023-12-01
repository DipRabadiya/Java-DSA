package Hashing;

import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        //create
        HashSet<Integer> set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search
        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(4)){
            System.out.println("Not contain");
        }

        //delete
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("delete contain 1");
//        }

        //size
        System.out.println("size of set: " + set.size());

        //print
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        //next hasnext
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
