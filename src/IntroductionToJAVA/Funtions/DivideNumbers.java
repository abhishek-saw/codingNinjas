package IntroductionToJAVA.Funtions;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int deno = s.nextInt();
        int result  = divideNumbers(num,deno); // if you want to use the result
        divideNumber(num,deno); // if you don't want to use the result
        System.out.println(result);
    }

    private static void divideNumber(int num, int deno) {
        if(deno==0) {
            System.out.println("Not Allowed");
            return;
        }
        System.out.println(num/deno);
    }
    private static int divideNumbers(int num, int deno) {
        if(deno==0){
            return Integer.MIN_VALUE; // strong keywords
        }
        return num/deno;
    }
}
