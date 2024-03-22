package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuyTicketsPair {
    public static void main(String[] args) {
        int[] input = {3,9,4};
        int k = 2;
        System.out.println(buyTicket(input,k));
        int[] input1 = {2,3,2,2,4};
        int k1 = 3;
        System.out.println(buyTicket(input1,k1));
    }
    public static int buyTicket(int[] input, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Pair> queue = new LinkedList<>();
        for(int i =0;i<input.length;i++){
            priorityQueue.add(input[i]);
            queue.add(new Pair(i,input[i]));
        }
        int time = 0;
        while(!queue.isEmpty()){
            if(priorityQueue.element()==queue.peek().priority){
                time++;
                if(k==queue.peek().index){
                    return time;
                }
                priorityQueue.poll();
                queue.poll();
            }
            else{
                queue.add(queue.poll());
            }
        }
        return time;
    }
}
