package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MergeTwoSortedLL {
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
        Node<Integer> mergedLLHead = null;
        Node<Integer> mergedLLTail = null;

        while(temp1!=null && temp2!=null){
            Node<Integer> toAdd;
            if(temp1.data<= temp2.data){
                toAdd = temp1;
                temp1 = temp1.next;
            }
            else {
                toAdd = temp2;
                temp2 = temp2.next;
            }
            if(mergedLLHead==null){
                mergedLLHead = toAdd;
                mergedLLTail = mergedLLHead;
            }
            else {
                mergedLLTail.next = toAdd;
                mergedLLTail = mergedLLTail.next;
            }
        }
        if (temp1 != null) {
            mergedLLTail.next = temp1;
        }
        if (temp2 != null){
            mergedLLTail.next = temp2;
        }
        return mergedLLHead;
    }
}