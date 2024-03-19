package DSAInJAVA.PriorityQueues.PriorityQueuesOne;

import java.util.ArrayList;

public class Priority_Queue_Min<T> {
//     Using Heap :
//     1. Complete Binary Tree (Arraylist- > Value , Priority)
//     2. Heap Order Priority
//     Heap : Any type T and its priority (int)
    //data structure
    private final ArrayList<Element<T>> heap;
    //constructors
    public Priority_Queue_Min(){
        heap = new ArrayList<>(); // for reference
    }
    //methods
    public int size(){
        return heap.size();
    }
    public  boolean isEmpty(){
        return heap.isEmpty();
    }
    public T getMin() throws Priority_Queue_Exception {
        if(heap.isEmpty()){
            throw new Priority_Queue_Exception();
        }
        return heap.get(0).value;
    }
    public void insert(T value, int priority) {
        Element<T> e  = new Element<>(value, priority);
        heap.add(e); // adding the element to the last
        upHeapify(); // moving the new value to its correct position of priority
    }
    private void upHeapify() {
        int childIndex = size()-1; //starting from the point where it was added
        int parentIndex = (childIndex-1)/2; // simple formula of parent node using the childNode
        while(childIndex>0){ // till the added point reaches the top
            //comparing the childNode priority with the parentNode priority
            if(heap.get(childIndex).priority<heap.get(parentIndex).priority){
                Element<T> temp = heap.get(childIndex); // saving the values
                heap.set(childIndex,heap.get(parentIndex)); //swapping parentNode->ChildNode
                heap.set(parentIndex,temp);//swapping ChildNode->parentNode
                childIndex = parentIndex; //moving the ChildNode up
                parentIndex = (childIndex-1)/2; //moving the parentNode up
            }
            else{
                return;
            }
        }
    }
    public T removeMin() throws Priority_Queue_Exception {
        if(heap.isEmpty()){
            throw new Priority_Queue_Exception();
        }
        Element<T> removed = heap.get(0); // saving the last value
        T ans = removed.value; // for returning the removeMin Value
        heap.set(0, heap.get(heap.size()-1)); // setting the last value to top
        heap.remove(heap.size()-1); // removed from last value
        downHeapify();
        return ans;
    }
    private void downHeapify() {
        int parentIndex = 0; //start from top
        int leftChildIndex  = 2*parentIndex+1;
        int rightChildIndex  = 2*parentIndex+2;
        while(leftChildIndex<heap.size() ) { // left is not present && right is not present
            int minIndex = parentIndex;
            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex<heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = rightChildIndex;
            }
            if(minIndex!=parentIndex) {
                Element<T> tElement = heap.get(minIndex);
                heap.set(minIndex, heap.get(parentIndex));
                heap.set(parentIndex, tElement);
                parentIndex = minIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            }
            else {
                break;
            }
        }
    }
}
