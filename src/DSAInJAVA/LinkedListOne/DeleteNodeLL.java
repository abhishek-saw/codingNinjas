package DSAInJAVA.LinkedListOne;

import static DSAInJAVA.LinkedListOne.LinkedListUse.printLinkedList;

public class DeleteNodeLL {
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

        printLinkedList(n1);
        int pos = 2;
        System.out.println();
        Node<Integer> result = deleteNode(n1,pos);
        printLinkedList(result);
        System.out.println();

        printLinkedList(result);
        int pos1 = 0;
        System.out.println();
        Node<Integer> result1 = deleteNode(result,pos1);
        printLinkedList(result1);
        System.out.println();

        printLinkedList(result1);
        int pos2 = 6;
        System.out.println();
        Node<Integer> result2 = deleteNode(result1,pos2);
        printLinkedList(result2);
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        Node<Integer> temp = head;
        if(temp==null && pos==0){
            return null ;
        }

        if(pos==0){
            head = temp.next;
            return head;
        }

        int index = 0;
        while(temp.next!=null){
            if(index==pos-1){
                Node<Integer> tempNext = temp.next.next;
                temp.next = tempNext;
                return head;
            }
            index++;
            temp = temp.next;
        }
        return head;
    }
}
