package DSAInJAVA.Hashmaps;

import java.util.HashMap;

public class LengthOfLongestSubsetWithZeroSum {
    public static void main(String[] args) {
        int [] arr = {95,-97,-387,-435,-5,-70,897,127,23,284};
        int [] arr1 = {2,-2,0,-2,2};
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr1));
    }
    public static int lengthOfLongestSubsetWithZeroSum(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength =-1;
        for (int i=0;i<arr.length;i++) {
            sum+=arr[i];
            //System.out.println("Current cumulative sum: "+sum);
            if (sum == 0) {
                maxLength=i+1;
            }
            if (map.containsKey(sum)) {
                int prevIndex=map.get(sum);
                //System.out.println("Sum found previously at index: "+prevIndex);
                int currLength=i-prevIndex;
                //System.out.println("Length of 0 sum: "+currLen);
                if (currLength>maxLength) {
                    maxLength=currLength;
                    //System.out.println("Max Length of 0 sum: "+maxLen);
                }
            }
            else {
                //System.out.println("Adding sum to HashMap");
                map.put(sum,i);
            }
            //System.out.println();
        }
        return maxLength;
    }
}
