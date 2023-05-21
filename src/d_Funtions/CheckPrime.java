package d_Funtions;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(checkPrime(num));
    }
    private static boolean checkPrime(int num) {
        for(int i=2; i<=num/2+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
