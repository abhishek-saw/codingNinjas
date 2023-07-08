package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class CharaterCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if(65<=ch && ch<=90){
            System.out.println("1");
        }
        else if(97<=ch && ch<=122) {
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}
