package Revision.LinkedListOne;

import java.util.Scanner;

import static Revision.LinkedListOne.LinkedListUse.printLinkedList;

public class TakeInputLL {
    public static void main(String[] args) {
        //Time Complexity is O(N)
        Node<Integer> head1 = takeInputOptimized();
        printLinkedList(head1);
        //Time Complexity is O(N^2)
        Node<Integer> head2 = takeInput();
        printLinkedList(head2);
    }
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null; //create head
        int data = s.nextInt();
        while(data!=-1){
            Node<Integer> currentNode = new Node<>(data); //create the node with input data
            if(head==null){
                head = currentNode; //for first time
            }
            else {
                Node<Integer> tail = head; //tail starts from head
                while (tail.next!=null) {
                    tail = tail.next; //goes to last tail
                }
                tail.next = currentNode; // updating the tail with currentNode
            }
            data = s.nextInt();
        }
        return head;
    }
    public static Node<Integer> takeInputOptimized() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null;
        Node<Integer> tail = null;
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            }
            else{tail.next = currentNode;
            tail = currentNode; //tail.next
                }
            data = s.nextInt();
        }
        return head;
    }
}
