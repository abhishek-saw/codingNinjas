package IntorductionToJAVA.ArrayTwo;
import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;
public class PushZeroesToEnd_2 {
    public static void main(String[] args) {
        int arr [] = {2,0,0,1,3,0,0};
        pushZeroesToEnd(arr);
        TakeInputAndPrint.printArray(arr);
    }
    // This can be done for all cases where we need only specific number to changed
    private static void pushZeroesToEnd(int[] arr) {
       int k = 0; //taking a position for swapping non-zero element
       for(int i=0;i<arr.length;i++){ // iteration through the loop
           if (arr[i]!=0) { // checking if the number is not zero
               int temp = arr[k]; // if the number is not zero the simply swapping the number with start position
               arr[k] = arr[i]; //interchanging
               arr[i] = temp; //now assigning the new value to old loop position
               k++; // increasing start position only when we are founding a non-zero element at the start position
           }
       }
    }
}
