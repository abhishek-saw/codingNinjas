package c_OperatorsAndForLoop;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal = s.nextInt();
        int binary = 0;
        int pow = 1;
        for(int i =0;decimal>0;decimal = decimal/2,i++){
            if(decimal%2!=0){
                binary = binary + pow;
            }
            pow*=10;
        }
        System.out.print(binary);

        }
}
