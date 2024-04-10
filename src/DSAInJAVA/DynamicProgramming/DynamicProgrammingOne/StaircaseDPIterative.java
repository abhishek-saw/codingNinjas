package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class StaircaseDPIterative {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(staircase(n));
    }
    private static long staircase(int n) {
        long [] dp = new long[n+1];
        if(n==0){
            return 1;
        }
        if(n==1 ||n==2){
            return n;
        }
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
