package IntorductionToJAVA.Patterns;

import java.util.Scanner;

public class TriangularAlphabet5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print((char)(('A')+n-j));
                j+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}
