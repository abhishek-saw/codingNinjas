package DSAInJAVA.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRecursively {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        int [] arr = {1,3,5,6,8,9};
        for(Integer integer: arr){
            q1.add(integer);
        }
        while(!q1.isEmpty()){
            System.out.print(q1.poll() + " ");
        }
        System.out.println();
        for(Integer integer: arr){
            q1.add(integer);
        }
        reverseQueueRecursively(q1);
        while(!q1.isEmpty()){
            System.out.print(q1.poll() + " ");
        }
    }

    public static void reverseQueueRecursively(Queue<Integer> q1) {
        if(q1.size()<=1){return;}
        int head = q1.poll();
        reverseQueueRecursively(q1);
        q1.add(head);
    }
}
