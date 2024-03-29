package Leetcode;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxProfit = 0;
        int minProfit = prices[0];
        for(int i =0;i<prices.length;i++){
            minProfit = Math.min(prices[i],minProfit);
            int profit = prices[i]-minProfit;
            maxProfit = Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);
    }
}
