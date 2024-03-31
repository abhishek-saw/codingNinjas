package DSAInJAVA.Hashmaps;

import java.util.HashMap;

public class PrintIntersection {
    public static void main(String[] args) {
        int [] arr1  = {1,3,2,2,3,6,2,5};
        int [] arr2  = {2,4,2,3,5,6,6};
        printIntersection(arr1,arr2);
    }
    private static void printIntersection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(Integer integer: arr2){
            if(hashMap.containsKey(integer)){
                hashMap.put(integer,hashMap.get(integer)+1);
            }
            hashMap.put(integer,1);
        }
        for(Integer integer: arr1){
            if(hashMap.containsKey(integer)){
                hashMap.put(integer,hashMap.get(integer)+1);
            }
        }
        System.out.println(hashMap);
        for(Integer integer: arr2){
            if(hashMap.containsKey(integer) && hashMap.get(integer)>1){
                System.out.print(integer + " ");
                hashMap.put(integer,hashMap.get(integer)-1);
            }
        }
    }
}
