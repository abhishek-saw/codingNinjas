package Revision.TimeComplexity;

public class ArrayEquilibriumIndexTwo{
    public static void main(String[] args) {
        //        Time Complexity : O(n)
        int [] arr = {6,1,6,5,3,2,5,0,5,6,0};
        System.out.println(arrayEquilibriumIndex(arr));
    }
    private static int arrayEquilibriumIndex(int[] arr) {
        int lSum = 0;
        int rSum = 0;
        for(int i=1;i<arr.length;i++){
            rSum+=arr[i];
        }
        for(int j=1;j<arr.length;j++){
            lSum+=arr[j-1];
            rSum-=arr[j];
            if(lSum==rSum){
                return j;
            }
        }
        return -1;
    }
}
