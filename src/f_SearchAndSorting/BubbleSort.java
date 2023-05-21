package f_SearchAndSorting;
import e_ArrayOne.TakeInputAndPrint;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,7,4,3,9,2,6};
        bubbleSort(arr);
        System.out.print("Sorted Array: ");
        TakeInputAndPrint.printArray(arr);
    }
    private static void bubbleSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){ // n-1-i , i subtracted so that we don't need last ith element to be compared
                if(arr[j]>arr[j+1]){
                    int temp = arr[j]; //saving the ith element in temp for swapping
                    arr[j] = arr[j+1]; //assigning the value of the min element to the ith element pos
                    arr[j+1] = temp; //assigning the value ith element to the location of the min element
                    //just for knowing what is happening after each round
                    System.out.print("Round "+ i +": ");
                    TakeInputAndPrint.printArray(arr);
                    System.out.println();
                }
            }
        }
    }
}
