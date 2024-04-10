package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class CountMinStepsToOneDPIterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countMinStepsToOne(n));
    }
    private static int countMinStepsToOne(int n) {
        int [] dp = new int[n+1];
        if(n<=1){
            return 0;
        }
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2 ;i<=n;i++) {
            int a = dp[i-1];
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            if(i%2==0){
                b = dp[i/2]; // if it is divisible then we will divide and not mod
            }
            if(i%3==0){
                c = dp[i/3];  // if it is divisible then we will divide and not mod
            }
            dp[i] = 1 + Math.min(a,Math.min(b,c));
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
