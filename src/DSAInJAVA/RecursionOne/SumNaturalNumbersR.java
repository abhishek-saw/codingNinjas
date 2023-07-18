package DSAInJAVA.RecursionOne;

public class SumNaturalNumbersR {
    public static int sumNaturalNumbersR(int n){
        if (n == 0) {
            return 0;
        }
        int smallerOutput = sumNaturalNumbersR(n-1);
        int output = n + smallerOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(sumNaturalNumbersR(10));
    }
}
