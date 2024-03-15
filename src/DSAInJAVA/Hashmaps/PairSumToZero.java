package DSAInJAVA.Hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PairSumToZero {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        int[] arr1 = {-2,1,-2,2,3};
        int[] arr2 = {0,0,0,0,0};
        System.out.println(pairSumoZero(arr1,arr1.length));
        System.out.println(pairSumoZero(arr2,arr2.length));
//        int[] arr = takeInput();
//        System.out.print(pairSumoZero(arr,arr.length));
//        100
//        41 -67 34 0 69 -24 78 -58 62 -64 5 -45 81 -27 61 -91 95 -42 27 -36 91 -4 2 -53 92 -82 21 -16 18 -95 47 -26 71 -38 69 -12 67 -99 35 -94 3 -11 22 -33 73 -64 41 -11 53 -68 47 -44 62 -57 37 -59 23 -41 29 -78 16 -35 90 -42 88 -6 40 -42 64 -48 46 -5 90 -29 70 -50 6 -1 93 -48 29 -23 84 -54 56 -40 66 -76 31 -8 44 -39 26 -23 37 -38 18 -82 29 -41

    }
    public static int pairSumoZero(int[] input, int size) {
        int pairs = 0;
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for(Integer integer: input){
            if(integerHashMap.containsKey(integer)){
                int count = integerHashMap.get(integer);
                integerHashMap.put(integer,count+1);
            }else {
                integerHashMap.put(integer,1);
            }
        }
        System.out.println(integerHashMap);
        for(Integer integer : integerHashMap.keySet()){
            if(integerHashMap.containsKey(-integer)){
                if (integerHashMap.containsKey(0)) { //for zero
                    pairs +=(integerHashMap.get(integer))*(integerHashMap.get(-integer)-1)/2;
                    integerHashMap.put(0, 0);
                }
                if(integerHashMap.get(integer)>0 && integerHashMap.get(-integer)>0) { // for any other number
                    pairs += integerHashMap.get(-integer) * integerHashMap.get(integer);
                    integerHashMap.put(integer, 0);
                    integerHashMap.put(-integer, 0);
                }
            }
        }
        System.out.println(integerHashMap);
        return pairs;
    }
}
