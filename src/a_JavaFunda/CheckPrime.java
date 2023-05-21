package a_JavaFunda;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isPrime = true;
        int div = 2;
        while(isPrime && div <= n/2){
            if(n % div == 0){
                System.out.println("Composite");
                return;
            }
            else{
                div += 1;
            }
        }
        System.out.println("Prime");
    }
}
