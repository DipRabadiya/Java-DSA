import java.util.HashMap;

public class leetcode930 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int N= 2;
        System.out.println(numSubarraysWithSum(nums , N));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int element:nums){
            sum+=element;
            count+=map.getOrDefault(sum-goal,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
