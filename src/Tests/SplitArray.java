package Tests;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class SplitArray {
    public static void main(String[] args) {
        int input [] = {4,3,1};
        System.out.println(splitArray(input));
        int input1 [] = {2,1};
        System.out.println(splitArray(input1));
        int input2 [] = {1,1,1};
        System.out.println(splitArray(input2));
        int input3[] = {1, 2, 3, 4};
        System.out.println(splitArray(input3));
    }

    private static boolean splitArray(int[] input) {
        return check(input, 0, 0, 0);
    }
    public static boolean check(int input[], int startIndex, int lSum, int rSum) {
        if (startIndex == input.length) {
            return lSum == rSum;
        }
        if (input[startIndex] % 5 == 0) {
            lSum += input[startIndex];
        } else if (input[startIndex] % 3 == 0) {
            rSum += input[startIndex];
        } else {
            boolean leftAns = check(input, startIndex + 1,
                    lSum + input[startIndex], rSum);
            boolean rightAns = check(input, startIndex + 1,
                    lSum, rSum + input[startIndex]);
            return leftAns || rightAns;
        }
        return check(input, startIndex + 1, lSum, rSum);
    }
}