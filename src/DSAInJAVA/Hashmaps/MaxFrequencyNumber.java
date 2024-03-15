package DSAInJAVA.Hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class MaxFrequencyNumber {
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
    public static void main(String[] args) throws IOException {
        int[] arr = takeInput();
//        int [] arr = {1,4,5};
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

