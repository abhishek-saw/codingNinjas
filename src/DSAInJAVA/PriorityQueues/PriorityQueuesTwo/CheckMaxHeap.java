package DSAInJAVA.PriorityQueues.PriorityQueuesTwo;

public class CheckMaxHeap {
    public static void main(String[] args) {
        int[] arr = {42,20,18,6,14,11,9,4};
        System.out.println(checkMaxHeap(arr));
        int[] arr1 = {2,20,18,6,14,11,9,4};
        System.out.println(checkMaxHeap(arr1));

    }

    private static boolean checkMaxHeap(int[] arr) {
        int parent = 0;
        int leftChild = 1;
        int rightChild = leftChild+1;
        while(leftChild<arr.length){
            int min = parent;
            if(arr[min]<arr[leftChild]) {
                min = leftChild;
            }
            if(rightChild<arr.length-1 && arr[min] < arr[rightChild]  ){
                min = rightChild;
            }
            if(min!=parent){
                return false;
            }
            else {
                parent++;
                leftChild = parent*2 + 1;
                rightChild = leftChild+1;
            }
        }
        return true;
    }
}
