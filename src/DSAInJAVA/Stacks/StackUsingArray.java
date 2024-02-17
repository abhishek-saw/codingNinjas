package DSAInJAVA.Stacks;


public class StackUsingArray {
    public StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }
    public StackUsingArray(int capacity){
        data = new int[capacity];
        topIndex = -1;
    }
    public void push(int elem) throws StackFullException {
        // Time Complexity : O(1)
        if(topIndex==data.length-1){
            throw new StackFullException();
        }
        data[topIndex+1] = elem;
        topIndex++;
    }
    public int top() throws StackEmptyException {
        // Time Complexity : O(1)
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }
    public int pop() throws StackEmptyException {
        // Time Complexity : O(1)
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int popElem = data[topIndex];
        topIndex--;
        return popElem;
    }
    public int size() {
        // Time Complexity : O(1)
        return topIndex+1;
    }
    public boolean isEmpty() {
        // Time Complexity : O(1)
        return topIndex == -1;
    }
    private int[] data;
    public int topIndex;
}
