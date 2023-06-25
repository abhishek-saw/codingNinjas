package IntorductionToJAVA.g_ArrayTwo;

import IntorductionToJAVA.e_ArrayOne.TakeInputAndPrint;

//There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ distribute some candies to all these houses.
//        You are given an integer, ‘X’. If the total number of candies received by any house is more than ‘X’, it will pass the rest of the candies to the next house to the right. The rightmost house will just throw the extra candies.
//        You must return an array of ‘N’ integers denoting the final number of candies for all the houses.
//        For example:
//        Input :
//        ‘N’ = 3, ‘P1’ = [2, 6, 1], ‘P2’ = [1, 2, 1], ‘X’ = 6
//        Output :
//        3 6 4
//        Explanation: Total candies at first house 2 + 1 = 3.
//        Total candies at the second house 6 + 2 = 8, extra = 8 - 6 = 2.
//        Total candies at the third house 1 + 1 + 2 ( extra from house 2) = 4.
public class ExtraCandies {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        int m =p1.length;
        int carry = 0;
        int candies [] = new int[n];
        for(int i =0;i<m;i++){
            candies[i] = p1[i]+p2[i]+carry;
            carry = 0;
            if(candies[i]>x){
                carry = candies[i] - x;;
                candies[i] = x;
            }
        }
        return candies;
    }
    public static void main(String[] args) {
        int n = 3;
        int x = 6;
        int p1[] = {2,6,1};
        int p2[] = {1,2,1};
        int answer[] = extraCandies(n, x, p1,p2);
        TakeInputAndPrint.printArray(answer);
    }
}
