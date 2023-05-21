package d_Funtions;

import java.util.Scanner;

public class NcR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        //functions calls
        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n - r);
        //final equation
        int answer = factN / (factR * factNR);
        int result = factorial(n,r);
        System.out.println(answer);
        System.out.print(result);
    }

    private static int factorial(int n, int r) {
        int factN1 = fact(n);
        int factR1 = fact(r);
        int factNR1 = fact(n - r);
        return factN1 / (factR1 * factNR1);
    }

    private static int fact(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
