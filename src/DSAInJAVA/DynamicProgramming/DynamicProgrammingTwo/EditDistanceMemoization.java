package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

public class EditDistanceMemoization {
    public static void main(String[] args) {
        String s = "abc";
        String t  = "dc";
        System.out.println(editDistance(s,t));
    }

    private static int editDistance(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int [] array:dp){
            Arrays.fill(array,-1);
        }
        return editDistanceHelper(s,t,0,0,dp);
    }

    private static int editDistanceHelper(String s, String t,int i, int j, int[][] dp) {
        if(i==s.length()||j==t.length()){
            return Math.abs(s.length() - i) + Math.abs(t.length() - j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j] = editDistanceHelper(s,t,i+1,j+1,dp);
        }
        else {
            int a = 1 + editDistanceHelper(s, t, i,j+1,dp);
            int b = 1 + editDistanceHelper(s, t,i+1,j,dp);
            int c = 1 + editDistanceHelper(s, t,i+1,j+1,dp);
            dp[i][j] = Math.min(a,Math.min(b,c));
        }
        return dp[i][j];
    }
}
