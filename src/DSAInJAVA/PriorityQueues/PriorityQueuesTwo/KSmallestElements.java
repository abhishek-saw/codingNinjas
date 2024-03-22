package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElements {
    public static void main(String[] args) {
        // TIME COMPLEXITY: O(nlogk)
        // SPACE COMPLEXITY: O(n)
        int[] input = {10, 5, 11, 2, 3, 7, 12, 1, 6};
        int k = 4;
        ArrayList<Integer> ans = kSmallest(input,k);
        System.out.println(ans);
    }
    private static ArrayList<Integer> kSmallest(int[] input, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> answer = new ArrayList<>();
        for(Integer integer:input){
            priorityQueue.add(integer);
        }
        System.out.println(priorityQueue);
        int i = 0;
        while (!priorityQueue.isEmpty()){
            if(i>=input.length-k){
                answer.add(priorityQueue.peek());
            }
            priorityQueue.poll();
            i++;
        }
        return answer;
    }
}
