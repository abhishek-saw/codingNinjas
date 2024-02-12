package IntroductionToJAVA.JavaFunda;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long p = s.nextInt();
            long r = s.nextInt();
            long t = s.nextInt();
            double SI = (p * r * t);
            double answer = SI / 100;
            System.out.println(answer);
        }
    }
}
