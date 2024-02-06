package DSAInJAVA.RecursionTwo;
import static IntorductionToJAVA.ArrayOne.TakeInputAndPrint.printArray;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 121, 12, 33, 24, 65, 6};
        int l = 0;
        int r = arr.length-1;
        printArray(arr);
        mergesort(arr,l,r);
        System.out.println();
        printArray(arr);
    }

    private static void mergesort(int[] arr,int l, int r) {
        if (arr.length == 1) {
            return;
        }
        int mid = (l+r)/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length-arr1.length];
        System.arraycopy(arr, 0, arr1, 0, mid);
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);
        mergesort(arr1,0, arr1.length);
        mergesort(arr2,0, arr2.length);
        merge(arr1,arr2,arr);
    }

    private static void merge(int[] arr1, int[] arr2,int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i< arr1.length){
                arr[k] = arr1[i];
                k++;
                i++;
            }
        while(j< arr2.length){
            arr[k] = arr2[j];
            k++;
            j++;
        }
    }
}
