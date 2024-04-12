package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.Arrays;

public class MaxMoneyLootedDPMemorization {
    public static void main(String[] args) {
        int [] arr1 = {5,5,10,100,10,5};
        int [] arr2 = {10,2,30,20,3,50};
        System.out.println(maxMoneyLooted(arr1));
        System.out.println(maxMoneyLooted(arr2));
    }
    private static int maxMoneyLooted(int[] houses) {
        int [] dp = new int[houses.length+1];
        Arrays.fill(dp,-1);
        return maxMoneyLootedHelper(houses,0,houses.length,dp);
    }

    private static int maxMoneyLootedHelper(int[] houses, int i, int n, int[] dp) {
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int max1 = houses[i] + maxMoneyLootedHelper(houses,i+2, n, dp);
        int max2 =  maxMoneyLootedHelper(houses,i+1, n, dp);
        dp[i] = Math.max(max1,max2);
        return dp[i];
    }
}
