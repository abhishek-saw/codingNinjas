package Revision.Recursion;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumNaturalNumbers(5));
    }

    private static int sumNaturalNumbers(int n) {
        if (n==0){
            return 0;
        }
        return n+sumNaturalNumbers(n-1);
    }
}
