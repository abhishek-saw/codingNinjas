package DSAInJAVA.LinkedList;

import static DSAInJAVA.LinkedList.LinkedListUse.printLinkedList;

public class InsertNodeLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(8);
        Node<Integer> n2 = new Node<>(7);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(8);
        Node<Integer> n5 = new Node<>(1);
        Node<Integer> n6 = new Node<>(3);
        Node<Integer> n7 = new Node<>(0);
        Node<Integer> n8 = new Node<>(7);
        Node<Integer> n9 = new Node<>(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        int pos = 5;
        int data  = 41;
        printLinkedList(n1);
        System.out.println();
        printLinkedList(insert(n1,pos,data));
        int pos1 = 0;
        int data1  = 41;
        System.out.println();
        printLinkedList(insert(n1,pos1,data1));

    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        Node<Integer> newNode = new Node<>(data);
        Node<Integer> temp = head;
        if (pos == 0) {
            newNode.next = temp;
            temp = newNode;
            head = temp;
            return head;
        }
        int index = 1;
        while(temp!=null) {
            if (index == pos) {
                Node<Integer> newTemp = temp.next;
                temp.next = newNode;
                newNode.next = newTemp;
                return head;
            }
            temp = temp.next;
            index++;
        }
        return head;
    }
}