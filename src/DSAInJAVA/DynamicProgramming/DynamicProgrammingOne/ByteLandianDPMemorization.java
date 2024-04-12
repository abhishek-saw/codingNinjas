package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

import java.util.HashMap;

public class ByteLandianDPMemorization {
    public static void main(String[] args) {
        long n = 12;
        HashMap<Long,Long> memo = new HashMap<>();
        System.out.println(bytelandian(n,memo));
    }

    private static long bytelandian(long n, HashMap<Long, Long> memo) {
        if(n==0){
            return 0;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        long a = bytelandian(n/2, memo);
        long b = bytelandian(n/3, memo);
        long c = bytelandian(n/4, memo);
        memo.put(n,Math.max(n,a+b+c));
        return memo.get(n);
    }
}
