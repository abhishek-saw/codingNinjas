package IntroductionToJAVA.JavaFunda;

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x1 = s.next();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        System.out.println(x1);
        System.out.println((m1+m2+m3)/3);
    }
}


