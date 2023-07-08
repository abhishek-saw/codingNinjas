package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class CalculateASCII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int i = ch;
        System.out.println(i);
    }
}
