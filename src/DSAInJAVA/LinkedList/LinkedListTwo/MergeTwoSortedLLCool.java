package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MergeTwoSortedLLCool {
    public static void main(String[] args) {
        //input
//        2 5 8 12 -1
//        3 6 9 -1
        Node<Integer> head1 = TakeInputLL.takeInputOptimized();
        printLLRecursively(head1);
        System.out.println();
        Node<Integer> head2 = TakeInputLL.takeInputOptimized();
        printLLRecursively(head2);
        System.out.println();
        System.out.println("Merged LL");
        printLLRecursively(mergeTwoSortedLL(head1, head2));
    }

    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> newHead = head1.data <=head2.data ? head1: head2;
        Node<Integer> currNode1 = newHead.next;
        Node<Integer> currNode2 = newHead==head1 ? head2 : head1;
        Node<Integer> head = newHead;
        while(currNode1!=null && currNode2!=null){
            if(currNode1.data<=currNode2.data){
                head.next = currNode1;
                head = currNode1;
                currNode1 = currNode1.next;
            }
            else{
                head.next = currNode2;
                head = currNode2;
                currNode2 = currNode2.next;
            }
        }
        if(currNode1!=null){
            head.next = currNode1;
        }
        else {
            head.next = currNode2;
        }
        return newHead;
    }
}