package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class MinNumberOfSquaresDPIterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minCount(n));
    }

    private static int minCount(int n) {
        int[] dp = new int[n+1];
        if(n==0){
            return n;
        }
        dp[0] = 0;
        for(int i = 1;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min,dp[i - j * j] );
            }
            dp[i] = 1 + min;
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
