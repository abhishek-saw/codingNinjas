package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class FibonacciDPMemorization {
    public static void main(String[] args) {
        // TIME COMPLEXITY :  O(n) using DP : Memorization :  storing + recursion
        int n = 35;
        int[] dp = new int[n+1]; // creating an array where we will store the recursion call values
        Arrays.fill(dp, -1); // initializing with -1
        int answer = fibonacci(n,dp); // calling the helper function along with dp
        System.out.println(Arrays.toString(dp));
        System.out.println(answer);// printing what is stored in our dp
    }
    private static int fibonacci(int n, int[] dp) {
        if(n==0 || n==1){ //base case
            dp[n] = n; // just to fill the whole dp
            return n; //simply return;
        }
        // checking if the value is already present or not so that we can decide
        // whether is their any need to call the recursive calls or not
        int a = dp[n-1]!=-1 ? dp[n-1] : fibonacci(n-1,dp);
        int b = dp[n-2]!=-1 ? dp[n-2] : fibonacci(n-2,dp);
        // v.v.v.v.important step this is the step where we are storing the
        // recursion call values that is memorization
        dp[n] = a+b;
//        this can be followed also:
//        if(dp[n]!=-1){
//            return dp[n];
//        }
//        int a = fibonacciHelper(n-1,dp);
//        int b = fibonacciHelper(n-2,dp);
        return dp[n];
    }
}
