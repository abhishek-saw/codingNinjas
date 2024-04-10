package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class MinNumberOfSquaresRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minCount(n));
    }

    private static int minCount(int n) {
        if (n == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int j = 1; j*j<=n; j++) {
            min = Math.min(min,1 + minCount(n - j*j));
        }
        return min;
    }
}
