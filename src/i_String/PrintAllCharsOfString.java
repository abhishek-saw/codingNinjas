package i_String;

import java.util.Scanner;

public class PrintAllCharsOfString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printAllCharsOfString(str);
    }
    private static void printAllCharsOfString(String str) {
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
