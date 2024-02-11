package Revision.TimeComplexity;


import static Revision.Arrays.ArrayOne.printArray;

public class ArrayIntersectionOne {
    public static void main(String[] args) {
        //        Time Complexity : O(mlogm + nlogn)
        int [] arr1 = {6,9,5,8};
        int [] arr2 = {9,2,4,1,8};
        intersection(arr1,arr2);
    }
    private static void intersection(int[] arr1, int[] arr2) {
        if(arr1.length==0 ||arr2.length==0){return;}
        mergeSort(arr1);
        mergeSort(arr2);
        printArray(arr1);
        printArray(arr2);
        int i = 0;
        int j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    private static void mergeSort(int[] arr) {
        if(arr.length==1) return;
        int[] arr1 = new int[arr.length/2];
        int[] arr2 = new int[arr.length-arr1.length];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        System.arraycopy(arr,arr1.length,arr2,0,arr2.length);
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr,arr1,arr2);
    }
    private static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i =0;
        int j = 0;
        int k =0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
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
