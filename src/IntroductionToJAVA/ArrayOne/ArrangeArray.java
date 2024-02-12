package IntroductionToJAVA.ArrayOne;

import java.util.Scanner;

public class ArrangeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        arrangArray(arr,n);
        arrangArray2(arr2,n);
        TakeInputAndPrint.printArray(arr);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
    }

    private static void arrangArray(int[] arr, int n) {
        if(n%2==0) {
            for (int i = 0; i < n / 2; i++) {
                arr[i] = 2 * i + 1;
                arr[arr.length - i - 1] = 2 * i + 2;
            }
        }
        else{
            for (int i = 0; i <= n / 2; i++) {
                arr[arr.length - i - 1] = 2 * i + 2;
                arr[i] = 2 * i + 1;

            }
        }
    }

    private static void arrangArray2(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        int num = 1;
        while(left<=right){
            if(num%2==1){
                arr[left] = num;
                left++;
                num++;
            }
            else{
                arr[right] = num;
                right--;
                num++;
            }
        }
    }

}
