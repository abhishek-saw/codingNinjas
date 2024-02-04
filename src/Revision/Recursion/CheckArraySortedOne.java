package Revision.Recursion;

public class CheckArraySortedOne {
    public static void main(String[] args) {
        int [] arr = {1,2,7,4};
        System.out.println(checkArraySorted(arr));
    }

    private static boolean checkArraySorted(int[] arr) {
        if(arr.length==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int [] smallArr = new int[arr.length-1];
        System.arraycopy(arr, 1, smallArr, 0, arr.length - 1);
        return checkArraySorted(smallArr);
    }
}
