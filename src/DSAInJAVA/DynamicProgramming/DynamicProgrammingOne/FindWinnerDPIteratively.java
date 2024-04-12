package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class FindWinnerDPIteratively {
    public static void main(String[] args) {
        int n = 4;
        int x = 2;
        int y = 3;
        System.out.println(findWinner(n,x,y));
    }

    private static String findWinner(int n, int x, int y) {
        int [] dp = new int[n+1];
        dp[1] = 1;
        int a;
        int b = 0;
        int c = 0;
        for(int i = 2;i<=dp.length;i++){
            if(i==x ||i ==y){
                dp[i] = 1;
                continue;
            }
            a = dp[i-1] ^1;
            if(i-x>=1){
                b = dp[i-x]^1;
            }
            if(i-y>=1){
                c = dp[i-y]^1;
            }
            dp[i] = Math.max(a,Math.max(b,c)); // 1>>0
        }
        if (dp[n] == 1) {
            return "Beerus";
        }
        else {
            return "Whis";
        }
    }
}
