package String;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        String s = "abcdabcabcd";
        int arr[] = new int[128];

        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            arr[ascii]+=1;
        }
        for(char i=0;i<arr.length;i++){
            if(arr[i]>0)
            System.out.println(arr[i] + " " + i);
        }
    }
}