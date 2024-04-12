package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class ByteLandianRecursion {
    public static void main(String[] args) {
        long n = 12;
        System.out.println(bytelandian(n));
    }

    private static long bytelandian(long n) {
        if(n==0){
            return 0;
        }
        long a = bytelandian(n/2);
        long b = bytelandian(n/3);
        long c = bytelandian(n/4);
        return Math.max(n,a+b+c);
    }
}
