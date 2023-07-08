package IntorductionToJAVA.ArrayTwo;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class PushZeroesToEnd_1 {
    public static void main(String[] args) {
        int arr [] = {2,0,0,1,3,0,0};
        pushZeroesToEnd(arr);
        TakeInputAndPrint.printArray(arr);
    }

    private static void pushZeroesToEnd(int[] arr) {
        int temp [] = new int[arr.length];
        int j=0;
        for(int i=0;i< temp.length;i++){
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i< temp.length;i++){
            arr[i] =temp[i];
        }
    }
}
