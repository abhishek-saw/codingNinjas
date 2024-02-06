package DSAInJAVA.Recursion.RecursionOne;

public class PowerR {
    public static int power(int x, int n){
        if(n==0 && x==0){
            return 1;
        }if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallerOutput = power(x,n-1);
        return x*smallerOutput;
    }
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
}
