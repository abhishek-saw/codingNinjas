package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
//        Time Complexity :  O(nlogn)
//        Space Complexity :  O(n);
        int[] arr = {1, 2, 3, 4, 5};
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        heapSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
    private static void heapSort(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(Integer integer : arr){
            priorityQueue.add(integer);
        }
        int index = arr.length;
        while (!priorityQueue.isEmpty()){
            arr[index-1] = priorityQueue.poll();
            index--;
        }
    }
}
