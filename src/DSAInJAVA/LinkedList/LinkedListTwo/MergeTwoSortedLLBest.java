package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MergeTwoSortedLLBest {
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
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
//        Here we are created reference of newHead & newTail and new Node
        Node<Integer> newHead;
//        Tail is created so that we don't have to traverse to last node of newHead to add
        Node<Integer> newTail;
//        Very important step to decide which head to set for newHead
        if(temp1.data<=temp2.data){
            newHead = temp1;
            newTail = newHead;
            temp1 = temp1.next;
        }
        else {
            newHead = temp2;
            newTail = newHead;
            temp2 = temp2.next;
        }
//        temp1 or temp2 is moved so that our comparing from next node of the temp which already added in newHead
        while (temp1!=null && temp2!=null){
            if(temp1.data>=temp2.data){
                newTail.next = temp2; // we are adding the smaller one to newTail{newHead} and moving the temp variable to next {for newHead}
                newTail = temp2; // we are pointing/moving to temp2 so that we can add to last element next time {For moving the newTail}
                temp2 = temp2.next;
            }
            else {
                newTail.next = temp1;
                newTail = temp1;
                temp1 = temp1.next;
            }
        }
        if(temp1!=null){
            newTail.next = temp1;
        }
        else{
            newTail.next = temp2;
        }
        return newHead;
    }
}