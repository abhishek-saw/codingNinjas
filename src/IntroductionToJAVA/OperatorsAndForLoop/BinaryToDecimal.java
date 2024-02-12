package IntroductionToJAVA.OperatorsAndForLoop;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binary = s.nextInt();
        int decimal = 0;;
        int  pow = 1;
        for(int i = 0 ;binary>0; binary = binary/10,i++){
            if(binary%10!=0) {
                decimal = decimal + pow;
            }
            pow*=2;
        }
        System.out.println(decimal);
    }
}
