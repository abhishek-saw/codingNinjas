package d_Funtions;

import java.util.Scanner;

public class CheckFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(checkMember(num));
    }

    private static boolean checkMember(int n) {
        if(n==0) {
            return true;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=0 ;i<=n;i++){
             c = a+b;
             a = b;
             b = c;
            if (c == n) {
                return true;
            }
        }

        return false;
    }
}
