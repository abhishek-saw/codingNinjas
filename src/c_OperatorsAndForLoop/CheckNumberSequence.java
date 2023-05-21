package c_OperatorsAndForLoop;
import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isTrue = true;
        for(int i=1;i<=n;i++){
            int firstNum = s.nextInt();
            for(int j=1;j<=n;j++) {
                int secondNum = s.nextInt();
                if (firstNum > secondNum){
                    isTrue = true;
                }
                else if(firstNum == secondNum){
                    isTrue = false;
                    System.out.print(false);
                    return;
                }
                secondNum=firstNum;
            }

        }
        System.out.print(isTrue);
    }
}
