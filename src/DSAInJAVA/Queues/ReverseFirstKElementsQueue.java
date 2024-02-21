package DSAInJAVA.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;
        PrintQueues.printQueues(reverseKElements(queue,k));
    }

    private static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if (input.isEmpty() || input.size() == 1) {
            return input;
        }
        Stack<Integer> stack1 = new Stack<>();
        int count =0;
        int size = input.size();
        while(count<k){
            stack1.push(input.poll());
            count++;
        }
        while (!stack1.isEmpty()){
            input.add(stack1.pop());
        }
       for(int i =0;i<size-k;i++) {
           input.add(input.poll());
       }
        return input;
    }
}
