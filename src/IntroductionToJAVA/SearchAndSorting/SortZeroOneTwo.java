package IntroductionToJAVA.SearchAndSorting;

import IntroductionToJAVA.ArrayOne.TakeInputAndPrint;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,0,2,1};
        int [] arr2 = {2,1,0,1,2,0};
        sortZeroOneTwo(arr1);
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        sortZeroOneTwo(arr2);
        TakeInputAndPrint.printArray(arr2);
    }
    private static void sortZeroOneTwo(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int i = 0;
        while(i<=e) {
            if (arr[i] == 0) {
                int temp = arr[s];
                arr[s] = arr[i];
                arr[i] = temp;
                s++;
                i++;
            }
            else if (arr[i] == 2) {
                int temp2 = arr[e];
                arr[e] = arr[i];
                arr[i] = temp2;
                e--;
            }
            else{
                i++;
            }
            System.out.print("Round " + i + ": ");
            TakeInputAndPrint.printArray(arr);
            System.out.println();
        }
    }
}
