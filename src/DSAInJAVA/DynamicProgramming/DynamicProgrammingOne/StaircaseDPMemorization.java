package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class StaircaseDPMemorization {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(staircase(n));
    }

    private static long staircase(int n) {
        long [] dp = new  long [n+1];
        Arrays.fill(dp,-1);
        long answer =  staircaseHelper(n,dp);
        System.out.println(Arrays.toString(dp));
        return answer;
    }

    private static long staircaseHelper(int n, long[] dp) {
        if(n==0){
            dp[n] = 1;
            return 1;
        }
        if(n==1){
            dp[n] = 1;
            return 1;
        }
        if(n==2){
            dp[n] = 2;
            return 2;
        }
        long a = dp[n-1]!=-1 ? dp[n-1] : staircase(n-1);
        long b = dp[n-2]!=-1 ? dp[n-2] : staircase(n-2);
        long c = dp[n-3]!=-1 ? dp[n-3] : staircase(n-3);
        dp[n] = a+b+c;
        return dp[n];
    }
}
