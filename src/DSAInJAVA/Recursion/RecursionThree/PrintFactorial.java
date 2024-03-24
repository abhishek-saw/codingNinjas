package DSAInJAVA.Recursion.RecursionThree;

public class PrintFactorial {
    public static void main(String[] args) {
        int n = 5;
        printFactorial(n,1);
    }

    private static void printFactorial(int input, int answer) {
        if(input==0){
            System.out.println(answer);
            return;
        }
        answer*=input;
        printFactorial(input-1, answer);
    }
}
