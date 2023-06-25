package IntorductionToJAVA.e_ArrayOne;

public class PrintAllPairsOne {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = {2,3,4,5,6};
        printAllParis(arr1,arr2);
    }
    private static void printAllParis(int[] arr1, int[] arr2) {
        for(int i = 0;i< arr1.length;i++){
            for(int j = i;j<arr2.length;j++){
                System.out.print(arr1[i]);
                System.out.print(arr2[j]);
                System.out.print(' ');
            }
        }
    }
}
