package DSAInJAVA.LinkedList.LinkedListOne;


import static DSAInJAVA.LinkedList.LinkedListOne.LinkedListUse.printLinkedList;
import static DSAInJAVA.LinkedList.LinkedListOne.TakeInputLL.takeInputOptimized;

public class IsPalindrome {
    public static void main(String[] args) {
        //input : 9 2 3 3 2 9 -1
        Node<Integer> head = takeInputOptimized();
        printLinkedList(head);
        System.out.println(isPalindrome(head));
        //Find the middle using fast and slow
        //Reverse from mid to end using 3 pointers
        //start loop/iteration from front and back comparing towards mid
    }

    private static boolean isPalindrome(Node<Integer> head) {
        if(head==null){
            return true;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        printLinkedList(slow);
        Node<Integer> curr = slow;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        printLinkedList(prev);
        boolean isPalindrome = true;
        while(prev!=null){
            if(!(head.data).equals(prev.data)){
                isPalindrome = false;
            }
            prev = prev.next;
            head = head.next;
        }
        return isPalindrome;
    }
}
