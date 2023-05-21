package b_Patterns;

import java.util.Scanner;

public class TriangularNumber9Isosceles {
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
                System.out.print(number1);
                number1+=1;
            }
            int number2 = i-1;
            while(number2>=1){
                System.out.print(number2);
                number2-=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
