package IntroductionToJAVA.ArrayTwo;

import IntroductionToJAVA.ArrayOne.TakeInputAndPrint;

public class SeparateNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {1,-4,-2,5,3};
        int[] answer = separateNegativeAndPositive(arr);
        TakeInputAndPrint.printArray(answer);
    }
    // This can be done for all cases where we need only specific number to changed
    private static int[] separateNegativeAndPositive(int[] arr) {
       int k = 0;
       for(int i=0;i<arr.length;i++){
           if (arr[i]<0) {
               int temp = arr[k];
               arr[k] = arr[i];
               arr[i] = temp;
               k++;
           }
       }
       return arr;
    }
}
