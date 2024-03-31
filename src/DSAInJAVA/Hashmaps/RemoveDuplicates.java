package DSAInJAVA.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 6, 3, 4, 3, 4, 5, 4, 1, 3, 4, 2, 1, 3, 3, 2};
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }
    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashMap<Integer,Boolean> integerHashMap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer integer: arr){
            if(integerHashMap.containsKey(integer)){
                continue;
            }
            ans.add(integer);
            integerHashMap.put(integer,true);
        }
        return ans;
    }
}
