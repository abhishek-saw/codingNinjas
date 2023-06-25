package IntorductionToJAVA.e_ArrayOne;

public class PrintAllPairsTwo {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 6, 5};
        printAllParis(arr);
    }
    private static void printAllParis(int[] arr) {
        for(int i = 0;i< arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print(arr[i]);
                System.out.print(arr[j]);
                System.out.print(' ');
            }
        }
    }
}
