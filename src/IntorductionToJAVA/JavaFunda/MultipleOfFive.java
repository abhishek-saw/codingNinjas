package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int p = s.nextInt();
            if(p%5==0){
                System.out.println("multiple of five");
            }
            else{
                System.out.println("not multiple of five");
            }
    }
}
