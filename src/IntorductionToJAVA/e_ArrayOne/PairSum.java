package IntorductionToJAVA.e_ArrayOne;

public class PairSum {
    public static void main(String[] args) {
        int arr1 [] = {1,3,6,2,5,4,3,2,4};
        int sum1 = 7;
        int arr2 [] = {1,3,6,2,5,4,3,2,4};
        int sum2 = 12;
        int arr3 [] = {2,8,10,5,-2,5};
        int sum3 = 10;
        int ans1 = pairSum(arr1,sum1);
        int ans2 = pairSum(arr2,sum2);
        int ans3 = pairSum(arr3,sum3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    private static int pairSum(int[] arr, int sum) {
        int count =0;
        for(int i =0;i< arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
