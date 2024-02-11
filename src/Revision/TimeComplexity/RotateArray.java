package Revision.TimeComplexity;

import static Revision.Arrays.ArrayOne.printArray;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int d = 2;
        printArray(arr);
        rotateArray(arr,d);
        printArray(arr);
     }
    private static void rotateArray(int[] arr, int d) {
        if(arr.length==0){
            return;
        }
        d = d%arr.length;
        reverse(arr,0,arr.length);
        printArray(arr);
        reverse(arr,0,arr.length-d);
        printArray(arr);
        reverse(arr,arr.length-d,arr.length);
    }
    private static void reverse(int[] arr, int s, int e) {
        int len = (e-s)/2;
        for(int i = 0;i<len;i++){
            int temp = arr[s+i];
            arr[s+i] = arr[e-i-1];
            arr[e-i-1] = temp;
        }
    }
}
