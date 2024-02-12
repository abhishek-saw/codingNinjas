package IntroductionToJAVA.OperatorsAndForLoop;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.print(0);
            return;
        }
        for (int i = 1; i <= n;i++) {
            if (i * i > n) {
                System.out.print(i-1);
                break;
            }
        }
    }
}
