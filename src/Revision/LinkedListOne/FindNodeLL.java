package Revision.LinkedListOne;

import static Revision.LinkedListOne.LinkedListUse.printLinkedList;

public class FindNodeLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        int i = 20;
        printLinkedList(n1);
        System.out.println(findNode(n1,i));
    }
    public static int findNode(Node<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        int count = 0;
        Node<Integer> temp = head;
        while(temp!=null){
            if(temp.data==n){
               return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }
}
