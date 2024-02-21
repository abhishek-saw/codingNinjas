package DSAInJAVA.Queues;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(T data){
        //adding in front of front will not work ,insertion should be done at the end front
        Node<T> newNode = new Node<>(data);
        if(front==null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode; // rear = rear.next
        }
        size++;
    }
    public T front() throws QueueEmptyException {
        if(front==null){
            throw new QueueEmptyException();
        }
        return front.data;
    }
    public T dequeue() throws QueueEmptyException {
        if(front==null){
            throw new QueueEmptyException();
        }
        T dequeueElement = front.data;
        front = front.next;
        if(front==null){
            rear = null;
        }
        size--;
        return dequeueElement;
    }
}
