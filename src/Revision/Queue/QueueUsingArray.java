package Revision.Queue;

public class QueueUsingArray {
    private int size;
    private int front;
    private int rear;
    private int [] array;
    QueueUsingArray(){
        array = new int[10];
        front =-1;
        rear = -1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int data){
        if(size==array.length){
            doubleCapacity();
        }
        if(size==0){
            front=0;
        }
        rear=(rear+1)%array.length;
        array[rear] = data;
        size++;
    }

    private void doubleCapacity() {
        int[] temp = array;
        array = new int[2*array.length];
        int index =0;
        for(int i = front;i<temp.length;i++){
            array[index++] = temp[i];
        }
        for(int i =0;i<front-1;i++){
            array[index++] = temp[i];
        }front = 0;
        rear = temp.length-1;
    }

    public int dequeue(){
        if(size==0){
            return -1;
        }
        int element = array[front];
        front=(front+1)%array.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return element;
    }
    public int peek(){
        if(size==0){
            return -1;
        }
        return array[front];
    }
}
