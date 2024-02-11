package Revision.LinkedListOne;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        int [] arr =  {10,10,20,20,20,30,40,10};
        ArrayList<Integer> answer = removeConsecutiveDuplicates(arr);
        for (Integer integer : answer){
            System.out.print(integer + " ");
        }
    }

    private static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
