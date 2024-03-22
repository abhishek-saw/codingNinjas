package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.PriorityQueue;

public class KthLargestElementBetter {
    public static void main(String[] args) {
        int[] input = {4, 1, 6, 3, 7, 2, 9, 8};
        int k = 5;
        System.out.println(kThLargest(input,k));
    }

    private static int kThLargest(int[] input, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            priorityQueue.add(input[i]);
        }
        for(int i = k;i<input.length;i++){
            int min = priorityQueue.element();
            if(min<input[i]){
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        System.out.println(priorityQueue);
        return priorityQueue.element();
    }

}
