package IntorductionToJAVA.ArrayTwo;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class ReverseArrayBetween_2 {
    private static int[] reverseBetween(int n, int l, int r, int []arr) {
        while(l<=r){
            swap(arr,l,r);
            l++;
            r--;
        }
        return arr;
    }
    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        int arr1 [] = {21,6,46,36,10};
        int start1 = 0;
        int end1 = 3;
        reverseBetween(arr1.length,start1,end1,arr1);
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        int arr2 [] = {21,2,17,39,48,41,44,23,22,7};
        int start2 = 9;
        int end2 = 9;
        reverseBetween(arr2.length,start2,end2,arr2);
        TakeInputAndPrint.printArray(arr2);
    }
}
