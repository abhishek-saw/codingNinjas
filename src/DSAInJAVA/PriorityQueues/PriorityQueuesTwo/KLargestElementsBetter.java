package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElementsBetter {
    public static void main(String[] args) {
        // TIME COMPLEXITY: O(n*logk)
        // SPACE COMPLEXITY: O(k)
        int[] input = {4, 1, 6, 3, 7, 2, 9, 8};
        int k = 3;
        ArrayList<Integer> ans = kLargest(input,k);
        System.out.println(ans);
    }
    private static ArrayList<Integer> kLargest(int[] input, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0;i<k;i++){ // add the first k element : O(klogk)
            priorityQueue.add(input[i]);
        }
        for(int i=k;i<input.length;i++){// now for the element staring from k in arr :  O((n-k)(logk))
            int min = priorityQueue.element(); // find min from PQ : O(1)
            if(min<input[i]){ //if it's greater than element in PQ
                priorityQueue.poll(); // remove the min element
                priorityQueue.add(input[i]); // add the greater element
            }
        }
        for (int i =0;i<k;i++){
            answer.add(priorityQueue.poll()); // now just form the arrayList
        }
        return answer;
    }
}
