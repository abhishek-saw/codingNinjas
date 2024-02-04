package Revision.Recursion;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(657));
    }

    private static int countDigits(int n) {
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}
