package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class Knapsack01DP {
    public static void main(String[] args) {
//        int [] weights = {1,2,4,5};
//        int [] values = {5,4,8,6};
//        int n = weights.length;
//        int maxWeight = 5;
        int[] weights = {20, 25, 30};
        int[] values = {200, 300, 100};
        int n = weights.length;
        int maxWeight = 50;
        System.out.println(knapsack(weights, values, n, maxWeight));
    }

    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= maxWeight; j++) {
                if (weights[i] <= j) {
                    int a = values[i] + dp[i + 1][j - weights[i]];
                    int b = dp[i + 1][j];
                    dp[i][j] = Math.max(a, b);
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][maxWeight];
    }
}