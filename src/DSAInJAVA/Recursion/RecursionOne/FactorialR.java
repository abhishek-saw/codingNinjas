package DSAInJAVA.Recursion.RecursionOne;

public class FactorialR {
    public static int factorial(int n){
        if (n == 0 || n == 1) {     // base case
            return 1;
        }

        int smallOutput = factorial(n-1); // Recursive Call:  function calling itself for smaller input
        int output = n*smallOutput; // Small Calculation
        return output;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
