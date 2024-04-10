package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class FibonacciRecursion {
    public static void main(String[] args) {
        // TIME COMPLEXITY :  O(2^n)
        int n = 35;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int a = fibonacci(n-1);
        int b = fibonacci(n-2);
        return a + b;
    }
}
