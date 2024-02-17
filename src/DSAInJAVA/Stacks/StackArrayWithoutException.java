package DSAInJAVA.Stacks;


public class StackArrayWithoutException {
    public StackArrayWithoutException(){
        data = new int[10];
        topIndex = -1;
    }
    public void push(int elem) {
        // Time Complexity : O(1)
        if(topIndex==data.length-1){
            doubleCapacity();
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
    private void doubleCapacity() {
        int[] arr = data;
        data = new int[data.length*2];
        System.arraycopy(arr, 0, data, 0, arr.length);
    }
    public int[] data;
    public int topIndex;
}
