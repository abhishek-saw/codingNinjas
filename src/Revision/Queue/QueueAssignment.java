package Revision.Queue;

import DSAInJAVA.Queues.PrintQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAssignment {
    public static void main(String[] args) throws Exception {
        System.out.println("reverseQueueRecursively");
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
        System.out.println();
        System.out.println("reverseKElements");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;
        PrintQueues.printQueues(reverseKElements(queue,k));
        System.out.println();
        System.out.println("printFib");
        int n = 5;
        printFib(n);
    }
    private static void printFib(int n) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enqueue(0);
        queueUsingArray.enqueue(1);
        for (int i = 0; i < n; i++) {
            int a = queueUsingArray.dequeue();
            int b = queueUsingArray.dequeue();
            queueUsingArray.enqueue(b);
            queueUsingArray.enqueue(a + b);
            System.out.print(a+" ");
        }
    }

    private static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
        if(queue.isEmpty()){
            return queue;
        }
        int m = 0;
        Stack<Integer> newStack = new Stack<>();
        while(m<k){
            newStack.add(queue.poll());
            m++;
        }
        Queue<Integer> newQueue = new LinkedList<>();
        while (!queue.isEmpty()){
            newQueue.add(queue.poll());
        }
        while (!newStack.isEmpty()){
            queue.add(newStack.pop());
        }
        while (!newQueue.isEmpty()){
            queue.add(newQueue.poll());
        }
        return queue;
    }

    private static void reverseQueueRecursively(Queue<Integer> q1) {
        if(q1.isEmpty()){
            return;
        }
        int data  = q1.poll();
        reverseQueueRecursively(q1);
        q1.add(data);
    }
}
