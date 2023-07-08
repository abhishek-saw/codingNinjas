package IntorductionToJAVA.Patterns;

import java.util.Scanner;

public class Star3Isosceles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int space1 = 1;
            while(space1<=n-i){
                System.out.print(' ');
                space1+=1;
            }
            int star1 = 1;
            while(star1<=i){
                System.out.print('*');
                star1+=1;
            }
            int star2 = 1;
            while(star2<=i-1){
                System.out.print('*');
                star2+=1;
            }
            System.out.println();
            i+=1;
        }

    }
}
