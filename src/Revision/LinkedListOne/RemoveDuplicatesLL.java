package Revision.LinkedListOne;

import java.util.Objects;

import static Revision.LinkedListOne.LinkedListUse.printLinkedList;
import static Revision.LinkedListOne.TakeInputLL.takeInputOptimized;

public class RemoveDuplicatesLL {
    public static void main(String[] args) {
//        input : 1 2 3 3 3 3 4 4 4 5 5 7 -1
        Node<Integer> head = takeInputOptimized();
        printLinkedList(head);
        printLinkedList(removeDuplicates(head));
    }
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
       if(head==null){
           return null;
       }
       Node<Integer> temp = head;
       while(temp.next!=null){
           if(temp.data.equals(temp.next.data)){
               temp.next = temp.next.next;
           }
           else {
               temp = temp.next;
           }
       }
       return head;
    }
}
