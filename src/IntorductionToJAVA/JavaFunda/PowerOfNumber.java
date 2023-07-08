package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int i = 1;
        if(x==0&&n==0){
            System.out.println("1");
        }
        else if(n==0){
            System.out.println("1");
        }
        else{
            int pow = 1;
            while(i<=n){
                pow*=x;
                i+=1;
            }
            System.out.println(pow);
        }
    }
}
