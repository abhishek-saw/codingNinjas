package Revision.Recursions.RecursionOne;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {1,2,7,4};
        System.out.println(sum(arr));
    }

    private static int sum(int[] input) {
        if(input.length==0){
            return 0;
        }
        int [] smallArray = new int[input.length-1];
        System.arraycopy(input, 1, smallArray, 0, smallArray.length);
        return input[0] + sum(smallArray);
    }
}
