package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class MinNumberOfSquaresDPMemorization {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minCount(n));
    }
    private static int minCount(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = minCountHelper(n,dp);
        System.out.println(Arrays.toString(dp));
        return ans;
    }

        private static int minCountHelper(int n, int[] dp) {
        if (n <= 3) {
            dp[n] = n;
            return n;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int ans = dp[n-i*i]!=-1 ? dp[n-i*i] : minCountHelper(n - i * i, dp);
            min = Math.min(min,ans);
        }
        dp[n] = 1 + min;
        return dp[n];
    }
}