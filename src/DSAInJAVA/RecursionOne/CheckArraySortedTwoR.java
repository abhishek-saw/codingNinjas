package DSAInJAVA.RecursionOne;

public class CheckArraySortedTwoR {
    public static boolean checkArraySorted(int[] arr){
        if(arr.length==1){ //base case
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int smallArray[] = new int[arr.length-1];
        for(int i =1;i<arr.length;i++){
            smallArray[i-1] = arr[i];
        }
        boolean isSmallArraySorted  = checkArraySorted(smallArray); // recursive call
        return isSmallArraySorted;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(checkArraySorted(arr));
    }
}
