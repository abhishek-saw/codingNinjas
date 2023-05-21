package c_OperatorsAndForLoop;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(2);
        for(int i = 3; i<=n ; i++){
            for(int j = 2; j<i ;){
                if(i%j==0){
                    break;
                }
                System.out.println(i);
                break;
            }
        }
    }
}


