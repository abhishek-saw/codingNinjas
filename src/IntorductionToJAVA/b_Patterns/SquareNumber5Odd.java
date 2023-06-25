package IntorductionToJAVA.b_Patterns;

import java.util.Scanner;

public class SquareNumber5Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int k = 1;
        while(i<=n){
            int j = 1;
            k = 2 * i - 1;
            while(j<=n) {
                System.out.print(k);
                k += 2;
                j += 1;
                if(k>2*n-1){
                    k=1;
                }
            }
            System.out.println();
            i+=1;
        }
    }
}
