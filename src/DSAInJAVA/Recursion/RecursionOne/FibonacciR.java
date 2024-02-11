package DSAInJAVA.Recursion.RecursionOne;

public class FibonacciR {
    public static int fibonacci(int n){
        if( n==1 || n==2 ){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        // Time Complexity : O(2^n)
        System.out.println(fibonacci(9));
    }
}
