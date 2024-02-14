package DSAInJAVA.LinkedList.LinkedListTwo;


public class CircularLinkedList {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        Node<Integer> head = n1;
        printCircularLinkedList(head);
    }
    private static void printCircularLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        do{
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        while (temp!= head);
    }
}
