package DSAInJAVA.LinkedList.LinkedListOne;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        int [] arr =  { 10,10,20,20,20,30,40,10};
        ArrayList<Integer> results = removeConsecutiveDuplicates(arr);
        for(Object i : results){
            System.out.println(i);
        }
    }

    private static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for(int i = 1;i <arr.length;i++){
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);;
            }
        }
        return result;
    }
}
