package DSAInJAVA.LinkedListOne;

import static DSAInJAVA.LinkedListOne.LinkedListUse.printLinkedList;

public class AppendLastNodeToFirst {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(4);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(7);
        Node<Integer> n4 = new Node<>(8);
        Node<Integer> n5 = new Node<>(3);
        Node<Integer> n6 = new Node<>(36);
        Node<Integer> n7 = new Node<>(8);
        Node<Integer> n8 = new Node<>(17);
        Node<Integer> n9 = new Node<>(26);
        Node<Integer> n10 = new Node<>(7);
        Node<Integer> n11 = new Node<>(7);



        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;

        Node<Integer> result = appendLastNToFirst(n1,7);
        printLinkedList(result);
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //finding the length of the Linked List
        if(head==null || n==0){
            return head ;
        }

        int length = 0;
        Node<Integer> lengthHead = head;
        while(lengthHead!=null){
            length++;
            lengthHead = lengthHead.next;
        }

        //moving the N Linked List

        Node<Integer> newHead = null;
        Node<Integer> temp = head;
        Node<Integer> nodeToBeAdded = head;

        int index = 1;
        while(temp!=null){
            if(index==length-n){
                newHead = temp.next;
                nodeToBeAdded.next = null;
            }
            index++;
            temp = temp.next;
            nodeToBeAdded = nodeToBeAdded.next;
        }
//
//        printLinkedList(newHead);
//        System.out.println();
//        printLinkedList(head);
//        System.out.println();

        //saving the head

        Node<Integer> temp2 = newHead;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        return newHead;
    }
}
