package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class CountWaysToMakeChangeDPBetter{
    public static void main(String[] args) {
        int [] denominations = {1,2,3,4,5,6};
        int value = 300;
        System.out.println(countWaysToMakeChange(denominations,value));
    }

    private static int countWaysToMakeChange(int[] denominations, int value) {
        int [] dp = new int[value+1];
        dp[0] = 1;
        for (int coins : denominations) {
            for (int j = coins; j <= value; j++) {
                dp[j] += dp[j - coins];
            }
        }
        return dp[value];
    }
}
