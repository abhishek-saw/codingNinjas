package e_ArrayOne;

public class SwapAlternative {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = {7,8,9,5,6,7};
        swapAlternative(arr1);
        swapAlternative(arr2);
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
    }
    private static void swapAlternative(int[] arr) {
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

    }
}
