package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class CountWaysToMakeChangeDP {
    public static void main(String[] args) {
        int[] denominations = {1, 2, 3};
        int value = 4;
        System.out.println(countWaysToMakeChange(denominations, value));
    }

    private static int countWaysToMakeChange(int[] denominations, int value) {
        int n = denominations.length;
        int[][] dp = new int[n + 1][value + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (denominations[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - denominations[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][value];
    }
}