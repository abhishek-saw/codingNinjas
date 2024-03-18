package Revision.Queue;

public class QueueUsingLinkedList {
    private int size;
    private Node front;
    private Node rear;
    QueueUsingLinkedList(){
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int data){
        if(front==null){
            front = new Node(data);
            rear = front;
        }
        else {
            rear.next = new Node(data);
            rear = rear.next;
        }
        size++;
    }

    public int dequeue() {
        int temp;
        if (size == 0) {
            return -1;
        } else {
            temp = front.data;
            front = front.next;
        }
        size--;
        return temp;
    }
    public int peek(){
        if(front==null){
            return -1;
        }
        return front.data;
    }
}
