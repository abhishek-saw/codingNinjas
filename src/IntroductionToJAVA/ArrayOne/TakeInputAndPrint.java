package IntroductionToJAVA.ArrayOne;
import java.util.Scanner;
public class TakeInputAndPrint {

    public static int[] takeInput() {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            return arr;
        }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
        public static void main (String[]args){
            int arr[] = takeInput();
            printArray(arr);
    }
}
