package DSAInJAVA.RecursionOne;

public class PrintNaturalNumbersR {
    public static void printOn(int n){
        if(n==0){ //base call
            return ;
        }
        if(n==1){ //base call
            System.out.print(1);
            return;
        }
        printOn(n-1); // recursive call
        System.out.print(" "+n); // small operation for n
    }
    public static void main(String[] args) {
        printOn(0);
        System.out.println();
        printOn(8);
    }
}
