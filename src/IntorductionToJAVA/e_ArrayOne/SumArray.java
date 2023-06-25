package IntorductionToJAVA.e_ArrayOne;

import java.util.Scanner;

public class SumArray {
    private static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int result = sumArray(arr);
        System.out.print(result);
    }
    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
