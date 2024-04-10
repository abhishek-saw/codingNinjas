package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class FibonacciDPIterative {
    public static void main(String[] args) {
        // TIME COMPLEXITY :  O(n)
        int n = 15;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n) {
        int [] dp = new int[n+1]; // same way used in memorization
        dp[0] = 0; // fill the dp with the base case
        dp[1] = 1; // fill the dp with the base case
        for(int i=2;i<=n;i++){ //
            dp[i] = dp[i-1] + dp[i-2]; // Recursion Relation
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
