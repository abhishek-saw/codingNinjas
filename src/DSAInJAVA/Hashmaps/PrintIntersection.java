package DSAInJAVA.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintIntersection {
    public static void main(String[] args) {
        int [] arr1  = {1,3,2,2,3,6,2,5};
        int [] arr2  = {2,4,2,3,5,6,6};
        printIntersection(arr1,arr2);
    }

    private static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer integer : arr2) {
            hashMap.put(integer, 1);
            ans.add(integer);
        }
        for (Integer integer : arr1) {
            if (hashMap.containsKey(integer)) {
                int count = hashMap.get(integer);
                count++;
                hashMap.put(integer, count);
            }
        }
        for (Integer integer : ans) {
            if (hashMap.containsKey(integer)) {
                int count = hashMap.get(integer);
                if (count > 1) {
                    System.out.print(integer + " ");
                }
                count--;
                hashMap.put(integer, count);
            }
        }
    }
}
