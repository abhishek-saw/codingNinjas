package DSAInJAVA.TimeComplexity;

public class ArrayEquilibriumIndexOne {
    public static void main(String[] args) {
        //        Time Complexity : O(n^2)
        int [] arr = {6,1,6,5,3,2,5,0,5,6,0};
        System.out.println(arrayEquilibriumIndex(arr));
    }

    private static int arrayEquilibriumIndex(int[] arr) {
        for (int i = 1;i<arr.length;i++){
            int rsum = 0;
            int lsum = 0;
            for(int m=0;m<i;m++){
                lsum+=arr[m];
            }
            for(int n=i+1;n<arr.length;n++){
                rsum+=arr[n];
            }
            if(rsum==lsum){
                return i;
            }
        }
        return -1;
    }
}
