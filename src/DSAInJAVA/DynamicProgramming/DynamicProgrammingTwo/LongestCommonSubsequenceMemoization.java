package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;


import java.util.Arrays;

public class LongestCommonSubsequenceMemoization {
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";
        System.out.println(lcs(s1, s2));
    }

    private static int lcs(String s1, String s2) {
        int [][] dp = new int[s1.length()+1][s2.length()+1];
        for(int [] arrays : dp){
            Arrays.fill(arrays,-1);
        }
        return lcsHelper(s1,s2,0,0,dp);
    }

    private static int lcsHelper(String s1, String s2, int i, int j, int[][] dp) {
        if(i==s1.length() || j==s2.length()) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] =  1 + lcsHelper(s1,s2,i+1,j+1, dp);
        }
        else {
            dp[i][j] = Math.max(lcsHelper(s1,s2,i+1,j, dp),lcsHelper(s1,s2,i,j+1, dp));
        }
        return dp[i][j];
    }
}