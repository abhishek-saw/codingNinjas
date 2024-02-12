package IntroductionToJAVA.Funtions;

import java.util.Scanner;

public class AddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sumation = sums(a,b);
        printEvenNumbers(a,b);
        System.out.print(sumation);

    }
    private static int sums(int a, int b) {
        return a + b;
    }
    private static void printEvenNumbers(int a, int b) {
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
