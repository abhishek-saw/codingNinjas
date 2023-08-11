package DSAInJAVA.TimeComplexity;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class RotateArray {
    public static void main(String[] args) {
        int arr [] = {1,3,6,11,12,17,22,26,30,33,38};
        int d = 7;
        rotate(arr,d);
        TakeInputAndPrint.printArray(arr);
    }

    private static void rotate(int[] arr, int d) {
     reverseArray(arr,0,arr.length);
     reverseArray(arr,0,arr.length-d);
     TakeInputAndPrint.printArray(arr);
     System.out.println();
     reverseArray(arr,arr.length-d,arr.length);
    }

    private static void reverseArray(int[] arr, int s, int length) {
        for(int i=0;i<(length-s)/2;i++){
            int temp = arr[s+i];
            arr[s+i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
    }
}
