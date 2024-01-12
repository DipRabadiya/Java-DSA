package Arrays;

public class Smaller_then_number {
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,7,8};

        int[] freq = new int[100];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println();

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }
        System.out.println(freq);

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = freq[arr[i] - 1];
            }
        }
        System.out.println(result);
    }
}
