package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;

import static DSAInJAVA.BackTracking.RatInAMaze.print;

public class EditDistanceDPBottomUp {
    public static void main(String[] args) {
        String s = "whgtdwhgtdg";
        String t = "aswcfg";
        System.out.println(editDistance(s, t));
    }

    private static int editDistance(String s, String t) {
        int [][] dp = new int[s.length() + 1][t.length() + 1];
        for (int[] array : dp) {
            Arrays.fill(array, 0);
        }
        for (int i = s.length(); i >= 0; i--) {
            for (int j = t.length(); j >= 0; j--) {
                if(s.length()==i ||j==t.length()){
                    dp[i][j] = Math.abs(s.length() - i) + Math.abs(t.length() - j); //v. v important base case
                }
                else if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    int a = 1 + dp[i][j + 1];
                    int b = 1 + dp[i+1][j];
                    int c = 1 + dp[i+1][j + 1];
                    dp[i][j] = Math.min(a,Math.min(b,c));
                }
            }
        }
        print(dp);
        return dp[0][0];
    }
}