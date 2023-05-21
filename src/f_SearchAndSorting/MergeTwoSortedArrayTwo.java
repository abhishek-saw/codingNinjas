package f_SearchAndSorting;
import e_ArrayOne.TakeInputAndPrint;

public class MergeTwoSortedArrayTwo {
    public static void main(String[] args) {
        int arr1 [] = {1,3,4,7,11};
        int arr2 [] = {2,4,6,13};
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
        System.out.println();
        int arr3 [] = mergeTwoSortedArray(arr1,arr2);
        System.out.println();
        TakeInputAndPrint.printArray(arr3);
    }
    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int i =0;
        int j =0;
        int k =0;
        // process of adding
        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        TakeInputAndPrint.printArray(result);
        // process of bubble sort
        for(int m =0;m<result.length;m++){
            for(int n =0;n<result.length-1;n++){
                if(result[n]>result[n+1]){
                    int temp = result[n];
                    result[n] = result[n+1];
                    result[n+1] = temp;
                }
            }
        }
        return result;
    }
}
