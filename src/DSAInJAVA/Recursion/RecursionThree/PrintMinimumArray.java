package DSAInJAVA.Recursion.RecursionThree;

public class PrintMinimumArray {
    public static void main(String[] args) {
        int [] arr = {4,3,2,10,9,6,7,8};
        printMinArray(arr,0,Integer.MAX_VALUE);
    }
    private static void printMinArray(int[] arr, int index, int minSoFar) {
        if(index == arr.length){
            System.out.println(minSoFar);
            return;
        }
        if(arr[index]<minSoFar){
            minSoFar = arr[index];
        }
        printMinArray(arr,index+1,minSoFar);
    }
}
