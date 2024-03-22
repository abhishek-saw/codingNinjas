package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.PriorityQueue;

public class InBuiltPQ {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 2, 3, 7, 12, 1, 6};
        for (Integer integer : arr){
            System.out.print(integer + " ");
        }
        System.out.println();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer integer: arr){
            priorityQueue.add(integer);
        }
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.peek() + " ");
            priorityQueue.poll();
        }
    }
}
