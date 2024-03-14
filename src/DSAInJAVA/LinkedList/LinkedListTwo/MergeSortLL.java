package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MergeSortLL {
    public static void main(String[] args) {
        //input : 2 3 1 3 14 7 5 1 4 1 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        System.out.println("MergeSort LL");
        printLLRecursively(mergeSortLL(head));
//        PrintLLRecursively.printLLRecursively(mergeSort(head));
    }
    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head==null ||head.next==null){
            return head;
        }
        Node<Integer> temp1 = head;
        Node<Integer> node1 = temp1;
        Node<Integer> node2 = midPointLL(head).next;
        while(temp1.next != node2 ){
            temp1 = temp1.next;
        }
        temp1.next = null;
        Node<Integer> sort1 = mergeSort(node1);
        Node<Integer> sort2 = mergeSort(node2);
        return MergeTwoSortedLL.mergeTwoSortedCleanLL(sort1,sort2);
    }
    public static Node<Integer> mergeSortLL(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        //Step 1 : Find the midpoint.next and setting in to midpoint.2
        Node<Integer> temp1 = head;
        Node<Integer> mid2 = midPointLL(temp1).next;
        //Step 2: Go to head of midpoint and set null just before that so that we get a first half of LL
        Node<Integer> temp2 = temp1 ;
        while(temp2.next!=mid2){
            temp2 = temp2.next;
        }
        temp2.next = null;
        //Step 3: Setting up the midpoint.1
        Node<Integer> mid1 = temp1;
        //Step 4: Calling the mergerSort for both the half's of LL
        Node<Integer> sortMid1 = mergeSortLL(mid1);
        Node<Integer> sortMid2 = mergeSortLL(mid2);
        //Step 5 : Merging the Two Sorted LL
        Node<Integer> sortedLL = mergeTwoSortedLL(sortMid1,sortMid2);
        return sortedLL;
    }
    private static Node<Integer> mergeTwoSortedLL(Node<Integer> head1 , Node<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> newHead;
        Node<Integer> newTail;
        if(head1.data<=head2.data){
            newHead = head1;
            head1 = head1.next;
        }
        else{
            newHead = head2;
            head2 = head2.next;
        }
        newTail = newHead;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                newTail.next = head1;
                newTail = head1;
                head1 = head1.next;
            }
            else{
                newTail.next = head2;
                newTail = head2;
                head2 = head2.next;
            }
        }
        if(head1!=null){
            newTail.next = head1;
        }
        if(head2!=null){
            newTail.next = head2;
        }
        return newHead;
    }
    private static Node<Integer> midPointLL(Node<Integer> temp1) {
        if(temp1==null || temp1.next==null){
            return temp1;
        }
        Node<Integer> slow = temp1;
        Node<Integer> fast = temp1.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
