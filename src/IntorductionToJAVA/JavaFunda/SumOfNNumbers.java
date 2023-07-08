package IntorductionToJAVA.JavaFunda;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n) {
            sum+=i;
            i+=1;
        }
        System.out.println(sum);
    }
}
