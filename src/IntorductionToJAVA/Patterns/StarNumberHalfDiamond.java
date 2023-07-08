package IntorductionToJAVA.Patterns;

import java.util.Scanner;

public class StarNumberHalfDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        System.out.println('*');
        while(i<=n){
            System.out.print('*');
            int num1 = 1;
            while(num1<=i){
                System.out.print(num1);
                num1+=1;
            }
            int num2 = i-1;
            while(num2>=1){
                System.out.print(num2);
                num2-=1;
            }
            System.out.print('*');
            System.out.println();
            i+=1;
        }
        int j = 1;
        while(j<n){
            System.out.print('*');
            int num1 = 1;
            while(num1<=n-j){
                System.out.print(num1);
                num1+=1;
            }
            int num2 = n-j-1;
            while(num2>=1){
                System.out.print(num2);
                num2-=1;
            }
            System.out.print('*');
            System.out.println();
            j+=1;
        }
        System.out.print('*');
    }
}
