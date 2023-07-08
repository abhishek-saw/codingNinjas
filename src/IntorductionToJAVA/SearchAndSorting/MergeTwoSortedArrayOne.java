package IntorductionToJAVA.SearchAndSorting;
import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class MergeTwoSortedArrayOne {
    public static void main(String[] args) {
        int arr1 [] = {1,3,4,7,11};
        int arr2 [] = {2,4,6,13};
        int arr3 [] = mergeTwoSortedArray(arr1,arr2);
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
        System.out.println();
        TakeInputAndPrint.printArray(arr3);
    }
    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< arr1.length && j< arr2.length){ // till one of the small array ends
            if(arr1[i]>arr2[j]){
                result[k] = arr2[j];
                j++;
            }
            else{
                result[k] = arr1[i];
                i++;
            }
            k++;
        }
        while(i< arr1.length) { //the larger array
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j< arr2.length) { //the larger array
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
