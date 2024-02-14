package DSAInJAVA.LinkedList.LinkedListTwo;

public class DoubleNode<T> {
    T data;
    DoubleNode<T> prev;
    DoubleNode<T> next;
    public DoubleNode(){
    }
    public DoubleNode(T data){
        this.data = data;
    }
}
