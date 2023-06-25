package c_OperatorsAndForLoop;
import java.util.Scanner;
//todo
public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isDec = true;
        int check=0;
        int prev = s.nextInt();

        for(int  i =1;i<n;i++) {
            int curr = s.nextInt();
            if(curr-prev==0) {
                isDec = false;
                break;
            }
            if (curr-prev>0 && check == 0) {
                check=1;
            }
            if (curr-prev<0 && check == 1) {
                isDec = false;
                break;
            }
            if (curr-prev<0) {
                check=0;
            }
            prev =curr;
        }
        System.out.println(isDec);

    }
}
