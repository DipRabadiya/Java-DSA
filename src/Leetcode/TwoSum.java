package Leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {15, 11, 2, 7};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int arr[] = new int[]{map.get(nums[i]), i};
                System.out.println(arr[0] + ", " + arr[1]);
                break;
            }
            map.put(target - nums[i], i);
        }
    }
}
