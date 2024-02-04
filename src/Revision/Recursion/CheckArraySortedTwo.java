package Revision.Recursion;

public class CheckArraySortedTwo {
    public static void main(String[] args) {
        int [] arr = {1,2,31,4,5,7};
        int s = 0;
        System.out.println(checkArraySorted(arr,s));
    }

    private static boolean checkArraySorted(int[] arr, int s) {
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]>arr[s+1]){
            return false;
        }
        return checkArraySorted(arr,s+1);
    }
}
