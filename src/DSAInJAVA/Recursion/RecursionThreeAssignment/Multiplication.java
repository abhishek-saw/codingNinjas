package DSAInJAVA.Recursion.RecursionThreeAssignment;

public class Multiplication {
    public static void main(String[] args) {
        int m = 3;
        int n = 15;
        System.out.println(multiplyTwoIntegers(m,n));
    }

    private static int multiplyTwoIntegers(int m, int n) {
        if(n==0) {
            return 0;
        }
        if(n==1){
            return m;
        }
        return m + multiplyTwoIntegers(m,n-1);
    }
}
