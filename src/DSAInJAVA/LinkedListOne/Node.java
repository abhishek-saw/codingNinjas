package DSAInJAVA.LinkedListOne;

public class Node<T> {
    T data;
    //T so that we can store any type of data
    Node<T> next;
    Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
