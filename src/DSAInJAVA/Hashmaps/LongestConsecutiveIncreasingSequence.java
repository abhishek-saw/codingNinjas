package DSAInJAVA.Hashmaps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveIncreasingSequence {
    public static void main(String[] args) throws IOException {
        int[] arr1 = {2,12,9,16,10,5,3,20,25,11,1,8,6};
        ArrayList <Integer> ans1 = longestConsecutiveIncreasingSequence(arr1);
        System.out.println(ans1);
    }

    private static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        ArrayList <Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for(Integer integer : arr){
            integerHashMap.put(integer,1);
        }
        int maxLength = 0;
        int start = 0;
        for(Integer integer : arr){
            int curr = integer;
            int length = 0;
            while(integerHashMap.containsKey(curr+1)) {
                length++;
                curr++;
            }
            if(maxLength<length){
                start = integer;
                maxLength = length;
            }
        }
        System.out.println(integerHashMap);
        System.out.println(start);
        System.out.println(maxLength);
        ans.add(start);
        ans.add(start+maxLength);
        return ans;
    }
}
