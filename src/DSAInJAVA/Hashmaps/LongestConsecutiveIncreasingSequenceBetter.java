package DSAInJAVA.Hashmaps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveIncreasingSequenceBetter {
    public static void main(String[] args) throws IOException {
        int[] arr1 = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        ArrayList<Integer> ans1 = longestConsecutiveIncreasingSequence(arr1);
        System.out.println(ans1);
    }

    private static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Boolean> vis = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            map.put(num, i);
            if (!vis.containsKey(num)) {
                vis.put(num, false);
            }
        }
        ArrayList <Integer> ans = new ArrayList<>();
        int globalMaxLength = 1;
        int globalMinStartIndex = 0;
        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            int currMinStartIndex = i;
            int count = 0;
            int temp = num;
            //Forward
            while (vis.containsKey(temp) && !vis.get(temp)) {
                vis.put(temp, true);
                count++;
                temp++;
            }
            temp = num - 1;
            //Backward
            while (vis.containsKey(temp) && !vis.get(temp)) {
                vis.put(temp, true);
                count++;
                currMinStartIndex = map.get(temp);
                temp--;
            }
            if (count > globalMaxLength) {
                globalMaxLength = count;
                globalMinStartIndex = currMinStartIndex;
            } else if (count == globalMaxLength) {
                if (currMinStartIndex < globalMinStartIndex) {
                    globalMaxLength = currMinStartIndex;
                }
            }
        }
        int globalStartNum = arr[globalMinStartIndex];
        ans.add(globalStartNum);
        if(globalMaxLength>1){
            ans.add(globalStartNum+globalMaxLength-1);
        }
        return ans;
    }
}
