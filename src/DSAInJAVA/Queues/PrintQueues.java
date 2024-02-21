package DSAInJAVA.Queues;

import java.util.Queue;

public class PrintQueues {
    public static void printQueues(Queue<Integer> queue){
        while(!queue.isEmpty()){
            System.out.print(queue.poll() +" ");
        }
    }
}
