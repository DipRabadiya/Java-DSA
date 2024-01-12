package DynamicProgramming;

import javax.swing.table.TableStringConverter;
import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60};
        int n=5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
//        dp[0]=0;
        System.out.println(Jump(n-1,arr,dp));
//        for(int i=0;i<n;i++){
//            int left = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
//            int right = Integer.MAX_VALUE;
//            if(i>1) right=dp[i-2] + Math.abs(arr[i] - arr[i-2]);
//            dp[i] = Math.min(left,right);
//        }
//        System.out.println(dp[n-1]);
    }

    private static int Tabulation(int n, int[] arr,int[] dp) {
        for(int i=0;i<n;i++){
            int left = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1) right=dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            dp[i] = Math.min(left,right);
        }
        return dp[n-1];
    }

    private static int Jump(int n,int[] arr,int[] dp) {
        if(n==0) return 0;

        if(dp[n] != -1) return dp[n];

        int left = Jump(n-1,arr,dp) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) right=Jump(n-2,arr,dp) + Math.abs(arr[n] - arr[n-2]);
        return dp[n] = Math.min(left,right);
    }
}