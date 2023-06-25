package IntorductionToJAVA.a_JavaFunda;

import java.util.Scanner;

public class MultiplyFloatingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float f1 = s.nextFloat();
        float f2 = s.nextFloat();
        double answer = f1*f2;
        System.out.println(f1*f2);
    }
}
