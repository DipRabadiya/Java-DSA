package Leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = nums[0], temp = 0;
        for (int num : nums) {
            // temp = temp > 0 ? temp + num : num;
            if (temp > 0) {
                temp = temp + num;
            } else {
                temp = num;
            }
            if (result < temp)
                result = temp;
        }
        System.out.println(result);
    }
}
