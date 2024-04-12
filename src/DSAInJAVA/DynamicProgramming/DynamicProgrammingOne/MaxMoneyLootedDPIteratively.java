package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class MaxMoneyLootedDPIteratively {
    public static void main(String[] args) {
        int [] arr1 = {5,5,10,100,10,5};
        int [] arr2 = {10,2,30,20,3,50};
        System.out.println(maxMoneyLooted(arr1));
        System.out.println(maxMoneyLooted(arr2));
    }
    private static int maxMoneyLooted(int[] houses) {
        int n = houses.length;
        int [] dp = new int[n];
        if(n==0){
            return 0;
        }
        if(n==1){
            return houses[0];
        }
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0],houses[1]);
        for(int i = 2 ;i<n;i++) {
            int max1 = houses[i] + dp[i - 2];
            int max2 = dp[i-1];
            dp[i] = Math.max(max1,max2);
        }
        return dp[n-1];
    }
}
