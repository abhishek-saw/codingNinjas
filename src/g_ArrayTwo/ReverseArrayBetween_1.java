package g_ArrayTwo;

import e_ArrayOne.TakeInputAndPrint;

public class ReverseArrayBetween_1 {
    private static void reverseArrayBetween(int[] a,int start, int end) {
        int length = (end - start)/2;
        for(int i = 0;i<=length;i++){
            int temp = a[start+i];
            a[start+i] = a[end-i];
            a[end-i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr1 [] = {21,6,46,36,10};
        int start1 = 0;
        int end1 = 3;
        reverseArrayBetween(arr1,start1,end1);
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        int arr2 [] = {21,2,17,39,48,41,44,23,22,7};
        int start2 = 9;
        int end2 = 9;
        reverseArrayBetween(arr2,start2,end2);
        TakeInputAndPrint.printArray(arr2);
    }
}
