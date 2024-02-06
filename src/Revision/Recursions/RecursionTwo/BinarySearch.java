package Revision.Recursions.RecursionTwo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 3, 14, 55, 56};
        System.out.println(binarySearch(arr,55,0,arr.length-1));
    }
    public static int binarySearch(int [] arr, int x,int s, int e){
        int mid = (s+e)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==x){
            return mid;
        } else if (arr[mid]>x) {
            return binarySearch(arr,x,s,mid-1);
        } else {
            return binarySearch(arr,x,mid+1,e);
        }
    }
}
