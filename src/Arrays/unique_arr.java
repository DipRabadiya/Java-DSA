package Arrays;

import java.util.HashSet;

public class unique_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        HashSet h1 = new HashSet();
        for(int i=0;i<arr.length;i++){
            h1.add(arr[i]);
        }
        if(arr.length==h1.size()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}