package DSAInJAVA.Queues;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        int[] arr = {10,20,30,40,50};
        for(int elem : arr){
            queueUsingArray.enqueue(elem);
        }
        System.out.println(queueUsingArray.isEmpty());
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.front());
        System.out.println(queueUsingArray.dequeue()); // 10 out
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.front());
        queueUsingArray.enqueue(80);
        queueUsingArray.enqueue(90);
        System.out.println(queueUsingArray.size());
        System.out.println(queueUsingArray.front());
        while(!queueUsingArray.isEmpty()){
            System.out.print(queueUsingArray.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queueUsingArray.isEmpty());

        System.out.println("-----------------------------------");
        QueueUsingLL<Integer> queueUsingArray2 = new QueueUsingLL<>();
        int[] arr2 = {10,20,30,40,50};
        for(int elem : arr2){
            queueUsingArray2.enqueue(elem);
        }
        System.out.println(queueUsingArray2.isEmpty());
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.front());
        System.out.println(queueUsingArray2.dequeue()); // 10 out
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.front());
        queueUsingArray2.enqueue(80);
        queueUsingArray2.enqueue(90);
        System.out.println(queueUsingArray2.size());
        System.out.println(queueUsingArray2.front());
        while(!queueUsingArray2.isEmpty()){
            System.out.print(queueUsingArray2.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queueUsingArray2.isEmpty());

    }
}
