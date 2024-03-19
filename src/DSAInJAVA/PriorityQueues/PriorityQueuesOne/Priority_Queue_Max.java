package DSAInJAVA.PriorityQueues.PriorityQueuesOne;

import java.util.ArrayList;

public class Priority_Queue_Max {
    private final ArrayList<Integer> heap;

    Priority_Queue_Max() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.isEmpty();
    }

    int getSize() {
        return heap.size();
    }

    int getMax() {
        if (heap.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return heap.get(0);
        }
    }

    void insert(int element) {
        heap.add(element);
        upHeapify();
    }

    private void upHeapify() {
        int child = heap.size()-1;
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (heap.get(child) > heap.get(parent)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(child));
                heap.set(child, temp);
                child = parent;
                parent = (child - 1) / 2;
            }
            else {
                return;
            }

        }
    }

    int removeMax() {
        int removedElement = heap.get(0);
        heap.set(0, heap.get(getSize() - 1));
        heap.remove(heap.size() - 1);
        downHeapify();
        return removedElement;
    }

    private void downHeapify() {
        int parent = 0;
        int maxIndex = 0;
        int child1 = 2 * parent + 1;
        int child2 = 2 * parent + 2;
        while (child1<heap.size()) {
            if (heap.get(maxIndex) < heap.get(child1)) {
                maxIndex = child1;
            }
            if(child2<heap.size() && heap.get(maxIndex)<heap.get(child2)) {
                maxIndex = child2;
            }
            else if (parent != maxIndex) {
                int temp = heap.get(maxIndex);
                heap.set(maxIndex, heap.get(parent));
                heap.set(parent, temp);
                parent = maxIndex;
                child1 = 2 * parent + 1;
                child2 = 2 * parent + 2;
            }
            else {
                break;
            }
        }
    }
}