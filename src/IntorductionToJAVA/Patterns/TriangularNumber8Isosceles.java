package IntorductionToJAVA.Patterns;

import java.util.Scanner;

public class TriangularNumber8Isosceles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int space = 1;
            while(space<=n-i){
                System.out.print(' ');
                space+=1;
            }
            int number1 = 1;
            while(number1<=i){
                System.out.print(i+number1-1);
                number1+=1;
            }
            int number2 = 0;
            while(number2<i-1){
                System.out.print(2*(i-1)-number2);
                number2+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
