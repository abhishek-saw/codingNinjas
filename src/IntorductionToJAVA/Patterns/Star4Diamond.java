package IntorductionToJAVA.Patterns;

import java.util.Scanner;

public class Star4Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int up = (n/2+1);
        while(i<=up){
            int space1 = 1;
            while(space1<=up-i){
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
        while(i<=n) {
            int space2 = 1;
            while (space2 <= i-up) {
                System.out.print(' ');
                space2 += 1;
            }
            int star3 = 1;
            while (star3 <= n-i+1) {
                System.out.print('*');
                star3 += 1;
            }
            int star4 = 1;
            while (star4<=n-i) {
                System.out.print('*');
                star4 += 1;
            }
            System.out.println();
            i+= 1;
        }
    }
}