package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class CountMinStepsToOneDPMemorization {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(countMinStepsToOne(n));
    }
    private static int countMinStepsToOne(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = countMinStepsToOneHelper(n,dp);
        System.out.println(Arrays.toString(dp));
        return ans;
    }
    private static int countMinStepsToOneHelper(int n, int[] dp) {
        if(n<=1){
            dp[0] = 0;
            return 0;
        }
        int a  = dp[n-1]!=-1 ? dp[n-1] : countMinStepsToOne(n-1);
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        if(n%2==0){
            b =  dp[n%2]!=-1 ? dp[n%2] : countMinStepsToOne(n/2);
        }
        if(n%3==0){
            c = dp[n%3]!=-1 ? dp[n%3] : countMinStepsToOne(n/3);
        }
        dp[n] = 1 + Math.min(a,Math.min(b,c));
        return dp[n];
    }
}
