package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

public class Knapsack01Memoization {
    public static void main(String[] args) {
        int [] weights = {1,2,4,5};
        int [] values = {5,4,8,6};
        int n = weights.length;
        int maxWeight = 5;
//        int [] weights = {20,25,30};
//        int [] values = {200,300,100};
//        int n = weights.length;
//        int maxWeight = 50;
        System.out.println(knapsack(weights,values,n,maxWeight));
    }
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return knapsackHelper(weights,values,dp,n,maxWeight);
    }

    private static int knapsackHelper(int[] weights, int[] values,int[][] dp,int n, int maxWeight) {
        if(maxWeight==0||n==0){
            return 0;
        }
        if(dp[n][maxWeight]!=-1){
            return dp[n][maxWeight];
        }
        if(weights[n-1]<=maxWeight){
            int a = values[n-1] + knapsackHelper(weights,values,dp,n-1,maxWeight-weights[n-1]);
            int b = knapsackHelper(weights,values, dp, n-1,maxWeight);
                dp[n][maxWeight] = Math.max(a,b);
        }
        else {
            dp[n][maxWeight]= knapsackHelper(weights,values, dp, n-1,maxWeight);
        }
        return dp[n][maxWeight];
    }
}
