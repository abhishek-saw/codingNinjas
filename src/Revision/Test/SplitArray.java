package Revision.Test;

public class SplitArray {
    public static void main(String[] args) {
        int[] input = {4,3,1};
        System.out.println(splitArray(input));
        int[] input1 = {2,1};
        System.out.println(splitArray(input1));
        int[] input2 = {1,1,1};
        System.out.println(splitArray(input2));
        int[] input3 = {1, 2, 3, 4};
        System.out.println(splitArray(input3));
    }

    private static boolean splitArray(int[] input) {
        return splitArrayNew(input,0,0,0);
    }

    private static boolean splitArrayNew(int[] input, int start, int lSum, int rSum) {
        if(start==input.length){
            return lSum == rSum;
        }
        if(input[start]%5==0){
            lSum+=input[start];
        }
        else if(input[start]%3==0){
            rSum+=input[start];
        }
        else {
            boolean isLeftCheck = splitArrayNew(input,start+1,lSum+input[start],rSum);
            boolean isRightCheck = splitArrayNew(input,start+1,lSum,rSum+input[start]);
            return isLeftCheck ||isRightCheck;
        }
        return splitArrayNew(input,start+1,lSum,rSum);
    }
}
