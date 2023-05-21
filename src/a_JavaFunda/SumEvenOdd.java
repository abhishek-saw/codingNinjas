package a_JavaFunda;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        while(n>0){
            int a = n%10;
            if(a%2==0){
                sumEven+=a;
            }
            else{
                sumOdd+=n%10;
            }
            n = n/10;
        }
        System.out.println(sumEven+" "+sumOdd);
    }
}
