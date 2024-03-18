package Revision.Stacks;

public class StackUsingArray {
    private int topIndex;
    private int [] data;
    public StackUsingArray(){
        topIndex =-1;
        data = new int[10];
    }
    public int top(){
        return data[topIndex];
    }
    public int size(){
        return topIndex+1;
    }
    public boolean isEmpty(){
        return topIndex == -1;
    }
    public void push(int elem){
        if(topIndex==data.length-1){
            int[] temp = data;
            data = new int[2*temp.length];
            System.arraycopy(temp, 0, data, 0, temp.length);
        }
        data[topIndex+1] = elem;
        topIndex++;
    }
    public int pop(){
        if(topIndex==-1){
            throw new RuntimeException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
