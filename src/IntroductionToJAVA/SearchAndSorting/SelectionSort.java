package IntroductionToJAVA.SearchAndSorting;
import IntroductionToJAVA.ArrayOne.TakeInputAndPrint;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {2,6,8,5,4,2,3};
        selectionSort(arr);
        System.out.print("Sorted Array: ");
        TakeInputAndPrint.printArray(arr);
    }
    private static void selectionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){ //Runs n-1 times
            int min = arr[i]; //taking an element
            int minIndex = i; //saving the location of the element for swapping
            for(int j = i+1;j<arr.length;j++){ //Runs n-1 times
                if(min > arr[j]){  //comparing will start from (i+1)
                    min = arr[j]; // getting the smallest element in the array for swapping
                    minIndex = j; //saving the location of the smallest element for swapping
                }
            }
            //just for knowing what is happening after each round
            System.out.print("Round "+ i +": ");
            TakeInputAndPrint.printArray(arr);
            System.out.println();
            //swapping element at min index with ith element
            int temp = arr[i]; //saving the ith element in temp for swapping
            arr[i] = arr[minIndex]; //assigning the value of the min element to the ith element position
            arr[minIndex] = temp; //assigning the value ith element to the location of the min element
        }
    }
}
