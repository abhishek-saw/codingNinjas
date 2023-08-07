package DSAInJAVA.RecursionTwo;

import static IntorductionToJAVA.ArrayOne.TakeInputAndPrint.printArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 121, 12, 33, 24, 65, 6};
        int s = 0;
        int e = arr.length-1;
        printArray(arr);
        quickSort(arr,s,e);
        System.out.println();
        printArray(arr);
    }

    private static void quickSort(int[] arr, int s, int e) {
        if(s>=e) {
            return;
        }
            int pivot = partition(arr, s, e);
            quickSort(arr, s, pivot - 1);
            quickSort(arr, pivot + 1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivotElement = arr[s];
        int count = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivotElement){
                count++;
            }
        }
        int temp = arr[s+count];
        arr[s+count] = pivotElement;
        arr[s] = temp;

        int i = s;
        int j = e;
        while(i<=j) {
            if (arr[i] < pivotElement) {
                i++;
            }
			else if(arr[j]>=pivotElement) {
                j--;
            }
            else {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        return s+count;
    }
}
