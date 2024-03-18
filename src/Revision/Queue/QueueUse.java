package Revision.Queue;


public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        int[] arr = {10,20,30,40,50};
        for(int elem : arr){
            queueUsingArray.enqueue(elem);
        }
        System.out.println(queueUsingArray.isEmpty());
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.isEmpty());
        System.out.println(queueUsingArray.peek());
        System.out.println(queueUsingArray.dequeue()); // 10 out
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.peek());
        queueUsingArray.enqueue(80);
        queueUsingArray.enqueue(90);
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.peek());
        while(!queueUsingArray.isEmpty()){
            System.out.print(queueUsingArray.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queueUsingArray.isEmpty());
        System.out.println("-----------------------------------");
        QueueUsingLinkedList queueUsingArray2 = new QueueUsingLinkedList();
        int[] arr2 = {10,20,30,40,50};
        for(int elem : arr2){
            queueUsingArray2.enqueue(elem);
        }
        System.out.println(queueUsingArray2.isEmpty());
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.isEmpty());
        System.out.println(queueUsingArray2.dequeue()); // 10 out
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.peek());
        queueUsingArray2.enqueue(80);
        queueUsingArray2.enqueue(90);
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.peek());
        while(!queueUsingArray2.isEmpty()){
            System.out.print(queueUsingArray2.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queueUsingArray2.isEmpty());
        System.out.println("-----------------------------------");
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();
        int[] arr1 = {10,20,30,40,50};
        for(int elem : arr1){
            queue.enqueue(elem);
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue()); // 10 out
        System.out.println(queue.size());
        System.out.println(queue.peek());
        queue.enqueue(80);
        queue.enqueue(90);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queue.isEmpty());
    }
}
