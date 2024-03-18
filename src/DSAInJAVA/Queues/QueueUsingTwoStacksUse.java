package DSAInJAVA.Queues;

public class QueueUsingTwoStacksUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();
        int[] arr = {10,20,30,40,50};
        for(int elem : arr){
            queue.enqueue(elem);
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.dequeue()); // 10 out
        System.out.println(queue.size());
        System.out.println(queue.front());
        queue.enqueue(80);
        queue.enqueue(90);
        System.out.println(queue.size());
        System.out.println(queue.front());
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
    }
}
