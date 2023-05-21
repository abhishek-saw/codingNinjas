package f_SearchAndSorting;
import e_ArrayOne.TakeInputAndPrint;

public class InsertionSort {
    public static void main(String[] args) {
        int arr [] = {1,0,8,5,4,2,3};
        insertionSort(arr);
        System.out.print("Sorted Array: ");
        TakeInputAndPrint.printArray(arr);
    }
    private static void insertionSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i]; // temp for comparing as value at i will change
            int j = i-1; // starting from j=i-1 ro j = 0
            //just for knowing what is happening after each round
            System.out.print("Round "+ i +": ");
            TakeInputAndPrint.printArray(arr);
            System.out.println();
            while(j>=0 && arr[j]>temp) { // j should be >= 0 and arr[j] is greater than temp we will swap
                arr[j+1] = arr[j]; // To swap we will assign the value at j+1 to j
                j--; // j is decrease , hence next time j will be one less
            }
            arr[j+1] = temp; // technically we should assign to j but jis decrease by one at last loop
        }
    }
}
