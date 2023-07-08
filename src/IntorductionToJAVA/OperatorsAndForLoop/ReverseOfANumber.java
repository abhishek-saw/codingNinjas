package IntorductionToJAVA.OperatorsAndForLoop;
import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev = 0;
        for(int i =1; n>0; n = n/10){
           rev = rev*10 + n%10;
            }
        System.out.print(rev);
        }
}
