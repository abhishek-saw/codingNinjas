package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

public class HeapSortInPlace {
    public static void main(String[] args) {
//        Time Complexity :  O(nlogn)
//        Space Complexity :  O(1)
        int[] arr = {10, 5, 11, 2, 3, 7, 12, 1, 6};
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
        //upHeapify Operation to build the heap one element at a time to n : O(n*log(n))
        for (int i = 1; i < arr.length; i++) {
            int child = i;
            int parent = (child - 1) / 2;
            while(child>0) {
                if (arr[child] < arr[parent]) {
                    int temp = arr[parent];
                    arr[parent] = arr[child];
                    arr[child] = temp;
                    child = parent;
                    parent = (child-1)/2;
                }
                else {
                    break;
                }
            }
        }
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //downHeapify Operation to sort the heap one element at a time to n :
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            int parent = 0;
            int leftChild = 2*parent + 1;
            int rightChild = leftChild + 2;
            while (leftChild<i){
                int max = parent;
                if(arr[max]>arr[leftChild]){
                    max = leftChild;
                }
                if(arr[max]>arr[rightChild] && rightChild<i){
                    max  = rightChild;
                }
                if(parent!=max){
                    int temp2 = arr[parent];
                    arr[parent] = arr[max];
                    arr[max] = temp2;
                    parent = max;
                    leftChild = 2*parent + 1;
                    rightChild = 2*parent + 2;
                }
                else {
                    break;
                }
            }
        }
    }
}
