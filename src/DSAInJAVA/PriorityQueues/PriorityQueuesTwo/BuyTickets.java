package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.*;

public class BuyTickets {
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
        for(Integer integer:input){ //adding the element into PQ to get max
            priorityQueue.add(integer);
        }
        Queue<Integer> integerQueue = new LinkedList<>();
        for(int i =0;i<input.length;i++){  //adding the pos into to get right index
            integerQueue.add(i);
        }
        int time = 0;
        while(!integerQueue.isEmpty()) {
            if(input[integerQueue.peek()]==priorityQueue.element()){ //compare with the current data of queue max of the PQ
                time++; //if true increase the time
                if(integerQueue.peek()== k){ //if right pos then return the time
                    return time;
                }
                integerQueue.remove(); //else we will go again as may be more element with sam epriority are in the queue
                priorityQueue.poll();
            }
            else{
                integerQueue.add(integerQueue.remove()); // if not max then dequeue and then add to the last
            }
        }
        return time;
    }
}
