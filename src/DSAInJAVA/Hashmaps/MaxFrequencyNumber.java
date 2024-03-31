package DSAInJAVA.Hashmaps;

import java.util.HashMap;

public class MaxFrequencyNumber {
    public static void main(String[] args) {
        int[] arr = {7, 2, 2, 4, 8, 4};
        System.out.println(maxFrequencyNumber(arr));
    }
    public static int maxFrequencyNumber(int [] arr){
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for (Integer integer : arr) {
            if(integerHashMap.containsKey(integer)){
                int count = integerHashMap.get(integer);
                count++;
                integerHashMap.put(integer,count);
            }
            else{
                integerHashMap.put(integer,1);
            }
        }
        System.out.println(integerHashMap.keySet());
        System.out.println(integerHashMap.values());
        int count = Integer.MIN_VALUE;
        int max = 0;
        for(Integer integer:arr){
            if(count<integerHashMap.get(integer)){
                max = integer;
                count = integerHashMap.get(integer);
            }
        }
        return max;
    }
}

