package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

public class MinCostPathDPTopDown {
    public static void main(String[] args) {
        int [][] cost = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
        int [][] cost1 = {{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
        System.out.println(minCostPath(cost));
        System.out.println(minCostPath(cost1));
    }
    private static int minCostPath(int[][] cost) {
        int m = cost.length;
        int n = cost[0].length-1;
        int [][] dp = new int[m+1][n+1];
        for (int[] array : dp) {
            Arrays.fill(array, Integer.MAX_VALUE);
        }
        for(int  i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(i==1 && j==1){
                    dp[i][j] = cost[0][0];
                    continue;
                }
                int a = dp[i-1][j];
                int b = dp[i][j-1];
                int c = dp[i-1][j-1];
                dp[i][j] = cost[i-1][j-1] + Math.min(a,Math.min(b,c));
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m][n];
    }
}
