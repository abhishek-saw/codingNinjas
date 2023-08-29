package DSAInJAVA.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

import static DSAInJAVA.LinkedList.LinkedListUse.printLinkedList;

public class TakeInputLL {
    public static void main(String[] args) {
        Node<Integer> head = takeInputOptimized();
        printLinkedList(head);
    }

    // TIME COMPLEXITY IS O(N^2)
    private static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data  = s.nextInt();
        Node<Integer> head = null;
        while(data!=-1){ // n times
            Node<Integer> currentNode = new Node<>(data);
            if(head==null){
                // make this node as head node
                head = currentNode;
            }
            else{
                Node<Integer> tail =  head;
                while(tail.next!=null){ // n times
                    tail= tail.next;
                }
                // now tail will refer to last node
                //connect current node after last node
                tail.next = currentNode;
            }
            data  = s.nextInt();
        }
        return head;
    }

    // TIME COMPLEXITY IS O(N)
    private static Node<Integer> takeInputOptimized() {
        Scanner s = new Scanner(System.in);
        int data  = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;

        while(data!=-1){ // n times
            Node<Integer> currentNode = new Node<>(data);
            if(head==null){
                // make this node as head node
                head = currentNode;
                tail = head;
            }
            tail.next = currentNode;
            tail  = tail.next;
//            tail = currentNode;
            data  = s.nextInt();
        }
        return head;
    }
}
