package DynamicProgramming;

import java.util.*;

public class FibonachhiNumber {
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        fibonachii(n);
        System.out.println(fibonachi(n,dp));
    }

    //tebluation
    private static void fibonachii(int n) {
        int prev2 = 0;
        int prev = 1;
        for(int i=2;i<=n;i++){
            int curi = prev+prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }

    //memoization
    private static int fibonachi(int n, int[] dp) {
        if(n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return  dp[n] = fibonachi(n-1,dp) + fibonachi(n-2,dp);
    }
}