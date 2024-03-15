package DSAInJAVA.Hashmaps;

import java.io.IOException;
import java.util.HashMap;

import static DSAInJAVA.Hashmaps.TakeInputHashmaps.takeInput;

public class PairSumToZeroBetter {

    public static void main(String[] args) throws IOException {
        int[] arr1 = {-2, 2, 6, -2, 2, -6, 3};
        int[] arr2 = {0, 0, 0, 0, 0};
        System.out.println(pairSumoZero(arr1, arr1.length));
        System.out.println(pairSumoZero(arr2, arr2.length));
//        int[] arr = takeInput();
//        System.out.print(pairSumoZero(arr, arr.length));
//        100
//        41 -67 34 0 69 -24 78 -58 62 -64 5 -45 81 -27 61 -91 95 -42 27 -36 91 -4 2 -53 92 -82 21 -16 18 -95 47 -26 71 -38 69 -12 67 -99 35 -94 3 -11 22 -33 73 -64 41 -11 53 -68 47 -44 62 -57 37 -59 23 -41 29 -78 16 -35 90 -42 88 -6 40 -42 64 -48 46 -5 90 -29 70 -50 6 -1 93 -48 29 -23 84 -54 56 -40 66 -76 31 -8 44 -39 26 -23 37 -38 18 -82 29 -41

    }

    public static int pairSumoZero(int[] input, int size) {
        int pairs = 0;
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (Integer integer : input) {
            if (integerHashMap.containsKey(-integer) && integerHashMap.get(-integer) != 0 ) {
                pairs += integerHashMap.get(-integer);
                if (integerHashMap.containsKey(integer)) {
                    int newCount = integerHashMap.get(integer);
                    integerHashMap.put(integer, newCount + 1);
                } else {
                    integerHashMap.put(integer, 1);
                }
            } else {
                if (integerHashMap.containsKey(integer)) {
                    int newCount = integerHashMap.get(integer);
                    integerHashMap.put(integer, newCount + 1);
                } else {
                    integerHashMap.put(integer, 1);
                }
            }
        }
        return pairs;
    }
}
