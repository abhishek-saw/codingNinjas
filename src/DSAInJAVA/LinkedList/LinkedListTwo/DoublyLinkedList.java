package DSAInJAVA.LinkedList.LinkedListTwo;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleNode<Integer> n1 = new DoubleNode<>(10);
        DoubleNode<Integer> n2 = new DoubleNode<>(20);
        DoubleNode<Integer> n3 = new DoubleNode<>(30);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = null;
        n1.prev = null;
    }
}
