package DSAInJAVA.Recursion.RecursionOne;

public class NumberOfDigitR {
    public static int count(int n){
        if(n/10==0){
            return 1;
        }
        int smallerOutput = count(n/10);

        return 1 + smallerOutput;
    }
    public static void main(String[] args) {
        System.out.println(count(1123));
    }
}
