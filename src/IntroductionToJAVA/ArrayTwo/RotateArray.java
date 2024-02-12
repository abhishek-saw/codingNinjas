package IntroductionToJAVA.ArrayTwo;

import IntroductionToJAVA.ArrayOne.TakeInputAndPrint;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        rotateArray(arr,d);
        TakeInputAndPrint.printArray(arr);
    }
    private static void rotateArray(int[] arr, int d) {
        int small [] = new int[d];
        int k = 0;
        for(int i = 0;i<d;i++){
                small[i] = arr[i];
            }
        for(int j = 0;j<arr.length;j++) {
            if (j < arr.length - d) {
                arr[j] = arr[j + d];
            } else {
                arr[j] = small[k];
                k++;
            }
        }
    }
}
