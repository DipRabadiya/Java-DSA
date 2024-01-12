package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=6;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(Steps(n,dp));
    }

    private static int Steps(int n,int[] dp) {
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n] != -1) return dp[n];

        int left = Steps(n-1,dp);
        int right = Steps(n-2,dp);
        return dp[n] = left + right;
    }
}