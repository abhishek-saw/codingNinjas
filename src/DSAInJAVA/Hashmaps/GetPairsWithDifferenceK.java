package DSAInJAVA.Hashmaps;

import java.util.HashMap;

public class GetPairsWithDifferenceK {
    public static void main(String[] args) {
        int[] arr = {2,-1,3,5,6,0,-1,2,6};
        int[] arr1 = {4,4,4,4};
        System.out.println(getPairsWithDifferenceK(arr,3));
        System.out.println(getPairsWithDifferenceK(arr1,0));
    }
    public static int getPairsWithDifferenceK(int[] arr, int k){
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for(Integer integer: arr){
            if(integerHashMap.containsKey(integer)){
                integerHashMap.put(integer,integerHashMap.get(integer)+1);
            }
            else{
                integerHashMap.put(integer,1);
            }
        }
        System.out.println(integerHashMap);
        if(integerHashMap.size()==1){
            return integerHashMap.get(arr[0])*(integerHashMap.get(arr[0])-1)/2;
        }
        int count = 0;
        for(Integer integer:integerHashMap.keySet()){
            if(integerHashMap.containsKey(integer+k)){
                if(integerHashMap.get(integer)>0) {
                    count += integerHashMap.get(integer) * integerHashMap.get(integer + k);
                }
            }
            if(integerHashMap.containsKey(integer-k)){
                if(integerHashMap.get(integer)>0) {
                    count += integerHashMap.get(integer) * integerHashMap.get(integer - k);
                }
            }
            integerHashMap.put(integer,0);
        }
        return count;
    }
}
