package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        double C = 0;
        while(S<=E){
            System.out.print(S);
            System.out.print(" ");
            C = (S-32)*(5.0/9.0);
            System.out.println((int)C);
            S+=W;
        }
    }
}
