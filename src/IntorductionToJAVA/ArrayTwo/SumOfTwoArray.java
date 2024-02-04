package IntorductionToJAVA.ArrayTwo;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class SumOfTwoArray {
    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = Math.max(arr1.length,arr2.length);
        int sum = 0;
        int carry = 0;
        while(i>=0 &&j>=0){//till small completes
            sum = arr1[i] + arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){//till large completes
            sum = arr1[i] + carry;
            output[k] = sum%10;
            carry = sum/10;
            i--;
            k--;
        }
        while(j>=0){//till large completes
            sum =  arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;
            j--;
            k--;
        }
        output[0] = carry;//if any carry
    }
    public static void main(String[] args) {
        int[] arr1 = {9,7,6,1};
        int[] arr2 = {4,5,9};
        int j1 = Math.max(arr1.length,arr2.length);
        int[] output1 = new int[j1+1];
        sumOfTwoArrays(arr1,arr2,output1);
        TakeInputAndPrint.printArray(output1);
        System.out.println();
        int[] arr3 = {4};
        int[] arr4 = {6,9,8,5};
        int j2 = Math.max(arr3.length,arr4.length);
        int[] output2 = new int[j2+1];
        sumOfTwoArrays(arr3,arr4,output2);
        TakeInputAndPrint.printArray(output2);
    }
}
