package Revision.LinkedListOne;
import static Revision.LinkedListOne.LinkedListUse.printLinkedList;
import static Revision.LinkedListOne.TakeInputLL.takeInputOptimized;

public class AppendLastNToFirst {
    public static void main(String[] args) {
//        input = 10 20 30 40 50 60 -1
        Node<Integer> head = takeInputOptimized();
        printLinkedList(head);
        int n = 3;
        printLinkedList(appendLastNToFirst(head, n));
        //find the length
        //subtract from the last n
        //keep two pointers first to get new node and second to destroy the prev link
        //add destroy node to last of the new node
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n){
        if(head==null){
            return null;
        }
        int totalElements = 0;
        Node<Integer> temp1 = head;
        while(temp1!=null){
            totalElements++;
            temp1 = temp1.next;
        }

        Node<Integer> temp2 = head;
        Node<Integer> newHead = null;
        Node<Integer> toAddNode = head;

        int mov = totalElements - n;
        int pos = 1;
        while(temp2!=null){
            if(pos==mov){
                newHead = temp2.next;
                toAddNode.next = null; //destroying
            }
            pos++;
            temp2 = temp2.next;
            toAddNode = toAddNode.next;
        }

        Node<Integer> temp3 = newHead;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        temp3.next = head;
        return newHead;
    }
}
