package DSAInJAVA.Queues;

public class QueueUsingArray {
    private int [] data;
    private int front; // index of the element at the front of the queue
    private int rear;// index of the element at the rear of the queue
    private int size;
    public QueueUsingArray(){
        data = new int[3];
        front = -1;
        rear = -1;
    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }
    // All function are O(1) Time Complexity
    public int size() {return size;}
    public boolean isEmpty() {return size==0;}
    public void enqueue(int element) {
        if(size==data.length){
           doubleCapacity();
//                       throw new QueueFullException();
        }
        if(size==0){
            front = 0;
        }
//        rear++;
//        if(rear==data.length){
//            rear = 0; //Circular Queue cool
//        }
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    private void doubleCapacity() {
            int[] temp = data;
            data = new int[2*data.length];
            int index =0;
            for(int i = front;i<temp.length;i++){
                data[index++] = temp[i];
            }
            for(int i =0;i<front-1;i++){
                data[index++] = temp[i];
            }
            front = 0;
            rear = temp.length-1;
    }

    public int dequeue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        int dequeueElement = data[front];
//        front++;
//        if(front==data.length){
//            front = 0;
//        }
        front = (front+1)% data.length;
        size--;
        if(size==0){
            front = -1;
            rear = -1;
        }
        return dequeueElement;
    }
    public int front() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        else {
            return data[front];
        }
    }
}
