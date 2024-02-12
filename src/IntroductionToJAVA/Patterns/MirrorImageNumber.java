package IntroductionToJAVA.Patterns;

import java.util.Scanner;

public class MirrorImageNumber {
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
            int star = 1;
            while(star<=i){
                System.out.print(star);
                star+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
