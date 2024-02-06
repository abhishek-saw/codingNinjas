package Revision.Recursions.RecursionTwo;

import static Revision.Arrays.ArrayOne.printArray;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 121, 12, 33, 24, 65, 6};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
    public static void mergeSort (int[] arr){
        if (arr.length==1){return;}
        int [] arr1 = new int[arr.length/2];
        int [] arr2 = new int[arr.length - arr1.length];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr,arr1,arr2);
    }
    private static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                arr[k] = arr2[j];
                j++;
            }
            else{
                arr[k] = arr1[i];
                i++;
            }
            k++;
        }
        while(i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
