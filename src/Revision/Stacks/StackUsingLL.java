package Revision.Stacks;

public class StackUsingLL {
    private int size;
    private Node head;
    public StackUsingLL(){
        size=0;
        head=null;
    }
    public int top(){
        if(head==null){
            return -1;
        }
        return head.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
         return size==0;
    }
    public void push(int elem){
        Node temp = head;
        head = new Node(elem);
        head.next = temp;
        size++;
    }
    public int pop(){
        if(head==null){
            return -1;
        }
        int elem = head.data;
        head = head.next;
        size--;
        return elem;
    }
}
