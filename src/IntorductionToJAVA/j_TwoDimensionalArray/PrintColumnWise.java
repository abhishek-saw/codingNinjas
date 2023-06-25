package IntorductionToJAVA.j_TwoDimensionalArray;

import IntorductionToJAVA.e_ArrayOne.TakeInputAndPrint;

public class PrintColumnWise {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr [0][0] = 1;
        arr [0][1] = 2;
        arr [0][2] = 3;
        arr [1][0] = 4;
        arr [1][1] = 5;
        arr [1][2] = 6;
        int result[] = printColumnWise(arr);
        TakeInputAndPrint.printArray(result);
    }

    private static int[] printColumnWise(int[][] a) {
        int result[] = new int[a.length*a[0].length];
        int pos = 0;
        for(int i =0;i<a[0].length;i++){
            for(int j =0;j<a.length;j++){
               result[pos] = a[j][i];
               pos++;
            }
        }
        return result;
    }
}
