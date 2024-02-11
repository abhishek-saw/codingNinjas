package Revision.LinkedListOne;

public class PrintReverseLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printLinkedListReverseRecursively(n1);
    }
    public static void printLinkedListReverseRecursively(Node<Integer> head) {
        if(head == null){
            return;
        }
        printLinkedListReverseRecursively(head.next);
        System.out.print(head.data + " ");
    }
}
