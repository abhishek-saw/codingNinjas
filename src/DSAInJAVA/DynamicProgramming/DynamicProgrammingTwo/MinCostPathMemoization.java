package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

public class MinCostPathMemoization {
    public static void main(String[] args) {
        int[][] input = {{3, 4, 1, 2}, {2, 1, 8, 9}, {4, 7, 8, 1}};
        int[][] input1 = {{5, 7, 2, 4}, {1, 8, 1, 3}, {6, 2, 9, 5}, {1, 6, 2, 8}};
        System.out.println(minCostPath(input));
        System.out.println(minCostPath(input1));
    }

    private static int minCostPath(int[][] input) {
        int[][] dp = new int[input.length + 1][input[0].length + 1];
        for (int[] its : dp) {
            Arrays.fill(its, -1);
        }

        return minCostPathHelper(input, 0, 0, input.length, input[0].length, dp);
    }
    private static int minCostPathHelper(int[][] input, int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) {
            return input[i][j];
        }
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
           return dp[i][j];
        }
        int a = minCostPathHelper(input, i, j + 1, m, n, dp);
        int b = minCostPathHelper(input, i + 1, j, m, n, dp);
        int c = minCostPathHelper(input, i + 1, j + 1, m, n, dp);
        dp[i][j] = input[i][j] + Math.min(a, Math.min(b, c));
        return dp[i][j];
    }
}