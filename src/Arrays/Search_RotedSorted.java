package Arrays;

public class Search_RotedSorted {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int n=5;
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            if(arr[i]==n) {
                System.out.println("Found");
                break;
            } else if(arr[j] == n){
                System.out.println("Found");
                break;
            } else {
                i++;
                j--;
            }
        }
    }
}
