package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;


import static DSAInJAVA.BackTracking.RatInAMaze.print;

public class LongestCommonSubsequenceDPUpDown {
    public static void main(String[] args) {
        String s1 = "abedgjc";
        String s2 = "bmdgsc";
        System.out.println(lcs(s1, s2));
    }

    private static int lcs(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        if(s1.isEmpty() && s2.isEmpty()){
            return 0;
        }
        for(int i = 1;i<dp.length;i++){
            for(int j =1;j<dp[i].length;j++){
                int a = dp[i-1][j];
                int b = dp[i][j-1];
                int c = dp[i-1][j-1];
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + c;
                }
                else{
                    dp[i][j] = Math.max(a,b);
                }
            }
        }
        print(dp);
        return dp[dp.length-1][dp[0].length-1];
    }
}