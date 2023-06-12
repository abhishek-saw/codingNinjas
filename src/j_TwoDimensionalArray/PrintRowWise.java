package j_TwoDimensionalArray;

import e_ArrayOne.TakeInputAndPrint;

public class PrintRowWise {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr [0][0] = 1;
        arr [0][1] = 2;
        arr [0][2] = 3;
        arr [1][0] = 4;
        arr [1][1] = 5;
        arr [1][2] = 6;
        int result[] = printRowWise(arr);
        TakeInputAndPrint.printArray(result);
    }

    private static int[] printRowWise(int[][] arr) {
        int result[] = new int[arr.length*arr[0].length];
        int pos = 0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
               result[pos] = arr[i][j];
               pos++;
            }
        }
        return result;
    }
}
