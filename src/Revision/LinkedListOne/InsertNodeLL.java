package Revision.LinkedListOne;

import static Revision.LinkedListOne.LinkedListUse.printLinkedList;

public class InsertNodeLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        int i1 = 50;
        printLinkedList(n1);
        insertNodeLL1(n1, i1);
        printLinkedList(n1);
        int i2 = 35;
        int pos = 0;
        printLinkedList(insertNodeLL2(n1, i2, pos));
    }
    private static Node<Integer> insertNodeLL2(Node<Integer> head, int data, int pos) {
        int count = 0;
        Node<Integer> currentNode = head;
        Node<Integer> newNode = new Node<>(data);

        if(head==null){
            return null;
        }
        if(pos==0){
            newNode.next = head; //new->head
            head = newNode; //head->new
            return head;
        }
        while(currentNode!=null){
            if(count==pos-1) {
                Node<Integer> nextNode = currentNode.next;
                currentNode.next = newNode;
                newNode.next = nextNode;
            }
            currentNode = currentNode.next;
            count++;
        }
        return head;
    }
    private static void insertNodeLL1(Node<Integer> head, int i) {
        Node<Integer> tail1 = head;
        while (tail1.next != null) {
            tail1 = tail1.next;
        }
        tail1.next = new Node<>(i);
    }
}
