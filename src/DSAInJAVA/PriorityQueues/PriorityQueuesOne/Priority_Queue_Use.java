package DSAInJAVA.PriorityQueues.PriorityQueuesOne;

public class Priority_Queue_Use {
    public static void main(String[] args) throws Priority_Queue_Exception {
        Priority_Queue_Min<Integer> priorityQueue = new Priority_Queue_Min<>();
        priorityQueue.insert(90,1);
        priorityQueue.insert(10,2);
        priorityQueue.insert(20,3);
        priorityQueue.insert(40,4);
        priorityQueue.insert(50,5);
        System.out.println(priorityQueue.getMin());
        System.out.println(priorityQueue.size());
        for (int i=0;i<5;i++){
            System.out.print(priorityQueue.removeMin() + " ");
        }
        Priority_Queue_Min<String> stringPriorityQueueMin = new Priority_Queue_Min<>();
        stringPriorityQueueMin.insert("abc",110);
        stringPriorityQueueMin.insert("def",13);
        stringPriorityQueueMin.insert("mno",90);
        stringPriorityQueueMin.insert("xyz",150);
        stringPriorityQueueMin.insert("klm",120);
        System.out.println(stringPriorityQueueMin.size());
        while (!stringPriorityQueueMin.isEmpty()){
            System.out.print(stringPriorityQueueMin.removeMin() + " ");
        }
        System.out.println();
        Priority_Queue_Max integerPriorityQueueMax = new Priority_Queue_Max();
        integerPriorityQueueMax.insert(17);
        integerPriorityQueueMax.insert(22);
        integerPriorityQueueMax.insert(13);
        integerPriorityQueueMax.insert(41);
        integerPriorityQueueMax.insert(75);
        System.out.println(integerPriorityQueueMax.getMax());
        System.out.println(integerPriorityQueueMax.getSize());
        while (!integerPriorityQueueMax.isEmpty()){
            System.out.print(integerPriorityQueueMax.removeMax() + " ");
        }
    }
}
