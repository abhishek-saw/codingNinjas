package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

public class BuildHeapInN {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 2, 3, 7, 12, 1, 6};
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        buildHeap(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
    private static void buildHeap(int[] arr) {
        //downHeapify Operation to build the heap : O(n)
        for (int i =arr.length/2-1;i>=0;i--){
            downHeapify(arr,i,arr.length);
        }
        //downHeapify Operation to sort the heap one element at a time to n :
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr,0,i);
        }
    }
    private static void downHeapify(int[] arr, int start, int end) {
        int parent = start;
        int leftChild = 2*parent+1;
        int rightChild = leftChild + 1;
        while(leftChild<end){
            int minIndex = parent;
            if(arr[leftChild]<arr[minIndex]){
               minIndex = leftChild;
            }
            if(arr[rightChild]<arr[minIndex] && rightChild<end){
                minIndex = rightChild;
            }
            if(minIndex==parent) {
              break;
            }
            int temp = arr[parent];
            arr[parent] = arr[minIndex];
            arr[minIndex] = temp;
            parent = minIndex;
            leftChild = 2*parent+1;
            rightChild = leftChild + 1;
        }
    }
}