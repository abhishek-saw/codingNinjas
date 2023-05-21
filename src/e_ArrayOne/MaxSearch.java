package e_ArrayOne;

public class MaxSearch {
    private static int maxSearch(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = TakeInputAndPrint.takeInput();
        int result = maxSearch(arr);
        System.out.print(result);
    }
}
