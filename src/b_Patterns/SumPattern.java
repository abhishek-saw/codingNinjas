package b_Patterns;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 2;
            int p = 1;
            int sum = 1;
            System.out.print(p);
            while(j<=i) {
                System.out.print('+');
                System.out.print(j);
                sum += j;
                j+=1;
            }
            System.out.print('=');
            System.out.print(sum);
            System.out.println();
            i+=1;
        }
    }
}
