package Revision.LinkedListOne;

import static Revision.LinkedListOne.LinkedListUse.printLinkedList;

public class DeleteNodeLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        int i = 0;
        printLinkedList(n1);
        printLinkedList(deleteNode(n1,i));
    }

    private static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if(head==null){
            return null;
        }
        if(pos==0){
            head = head.next;
            return head;
        }
        int count = 0;
        Node<Integer> currentNode = head;
        while(currentNode.next!=null){
            if(count == pos-1){
                currentNode.next = currentNode.next.next;
                return head;
            }
            count++;
            currentNode = currentNode.next;
        }
        return head;
    }
}
