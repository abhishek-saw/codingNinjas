package DSAInJAVA.Hashmaps;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintIntersectionBetter {
    public static void main(String[] args) {
        int [] arr1  = {1,3,2,2,3,6,2,5};
        int [] arr2  = {2,4,2,3,5,6,6};
        printIntersection(arr1,arr2);
    }

    private static void printIntersection(int[] arr1, int[] arr2) {
        //TIME COMPLEXITY : O(M+N)
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer integer : arr1) {
            int count = 1;
            if (hashMap.containsKey(integer)) {
                count = hashMap.get(integer);
                count++;
            }
            hashMap.put(integer, count);
        }
        for (Integer integer : arr2) {
            if (hashMap.containsKey(integer)) {
                int freq = hashMap.get(integer);
                if(freq>0) {
                    System.out.print(integer + " ");
                    freq--;
                }
                hashMap.put(integer, freq);
            }
        }
    }
}
