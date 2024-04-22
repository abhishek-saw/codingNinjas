package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

public class MinCostPathDPBottomUp {
    public static void main(String[] args) {
        int [][] input = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
        int [][] input1 = {{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
        System.out.println(minCostPath(input));
        System.out.println(minCostPath(input1));
    }
    private static int minCostPath(int[][] input) {
        int m = input.length;
        int n = input[0].length-1;
        int [][] dp = new int[m+1][n+1];
        for (int[] array : dp) {
            Arrays.fill(array, Integer.MAX_VALUE);
        }
        for(int  i = m-1;i>=0;i--){
            for(int j= n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[m-1][n-1] = input[m-1][n-1];
                    continue;
                }
                int a = dp[i][j+1];
                int b = dp[i+1][j];
                int c = dp[i+1][j+1];
                dp[i][j] = input[i][j] + Math.min(a,Math.min(b,c));
            }
        }
        return dp[0][0];
    }
}
