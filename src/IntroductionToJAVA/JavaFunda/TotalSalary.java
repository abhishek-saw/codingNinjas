package IntroductionToJAVA.JavaFunda;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalSalary;
        int basic = s.nextInt();
        char grade = s.next().charAt(0);
        double hra =  0.20*basic;
        double da =  0.50*basic;
        double pf =  0.11*basic;
        int allow;
        if(grade=='A'){
            allow = 1700;
        }
        else if(grade=='B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        totalSalary = basic + hra + da + allow -pf;
        System.out.println(Math.round(totalSalary));
    }
}
