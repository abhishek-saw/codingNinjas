package Revision.Recursions.RecursionTwo;

import static Revision.Arrays.ArrayOne.printArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 121, 12, 33, 24, 65, 6};
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
    public static void quickSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int pivotIndex = partition(arr, s, e);
        quickSort(arr,s,pivotIndex-1);
        quickSort(arr,pivotIndex+1,e);
    }
    private static int partition(int[] arr, int s, int e) {
        int pivotE = arr[s];
        int count = 0;
        for(int i = s+1;i<=e;i++){
            if(arr[i]<pivotE){
                count++;
            }
        }
        int temp = arr[s+count];
        arr[s+count] = pivotE;
        arr[s] = temp;

        int i = s;
        int j = e;
        while(i<j){
            if(arr[i]<pivotE){
                i++;
            }
            else if(arr[j]>=pivotE){
                j--;
            }
            else {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;
            }
        }
        return count+s;
    }
}
