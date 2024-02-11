package Revision.LinkedListOne;
import static Revision.LinkedListOne.LinkedListUse.printLinkedList;

public class AppendLastNToFirst {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLinkedList(n1);
        appendLastNToFirst(n1,2);
        printLinkedList(n1);
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n){
        if(head==null){
            return null;
        }
        Node<Integer> temp = head;

        return head;
    }
}
