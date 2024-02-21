package DSAInJAVA.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        // Behavior matters not how data is stored in memory
        // Its ADT : Abstract Data Type(Operation only matters)
        // e.g. stack of people in bank queue
        // FIFO : FIRST IN FIRST OUT
        // Insertion at bottom/rear end of queue
        // Deletion at top/front end of queue
        // both end are open
        // Basic Operation :
        // enqueue() -> to insert at the bottom of the queue
        // front() -> to get first element from front end
        // dequeue() -> to delete element from front end of the queue
        // size() -> size of queue
        // isEmpty() -> Empty: true && Not Empty: false

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<5;i++)
        {
            q.add(10+i);
        }
        System.out.print(q.poll()+" "+q.size());

    }
}
