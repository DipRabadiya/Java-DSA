package String;

import java.sql.SQLOutput;

public class reverseWord {
    public static void main(String[] args) {
        String s = "Hello My name is Dip";
        char[] arr = s.toCharArray();
        int left = 0,right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                right=i-1;
                reverseWords(arr,left,right);
                left=i+1;
            }
        }
        right=arr.length-1;
        reverseWords(arr,left,right);
        System.out.println(new String(arr));
    }

    private static void reverseWords(char[] arr, int left, int right) {
        while(left<right){
            char temp=arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}