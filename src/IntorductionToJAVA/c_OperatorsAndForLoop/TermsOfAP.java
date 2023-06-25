package IntorductionToJAVA.c_OperatorsAndForLoop;
import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = 0;
        for(int i=1,j =1;j<=n;i++){
            t = (3*i+2);
            if(t%4==0){
                continue;
            }
            j++;
            System.out.print(t);
            System.out.print(' ');
        }
    }
}
