package DSAInJAVA.RecursionOne;

public class CheckArraySortedOneR {
    public static boolean checkArraySorted(int[] arr,int si){
        if(si==arr.length-1){ //base case
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        return checkArraySorted(arr,si+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int si = 0;
        System.out.println(checkArraySorted(arr,si));
    }
}
