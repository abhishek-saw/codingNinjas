package DSAInJAVA.LinkedList.LinkedListOne;


import static DSAInJAVA.LinkedList.LinkedListOne.LinkedListUse.printLinkedList;
import static DSAInJAVA.LinkedList.LinkedListOne.TakeInputLL.takeInputOptimized;

public class IsPalindrome {
    public static void main(String[] args) {
        //input : 9 2 3 3 2 9 -1
        Node<Integer> head = takeInputOptimized();
        printLinkedList(head);
        System.out.println();
        System.out.println(isPalindrome(head));
        printLinkedList(head);
        System.out.println();
        System.out.println(isPalindrome2(head));
        //Find the middle using fast and slow
        //Reverse from mid to end using 3 pointers
        //start loop/iteration from front and back comparing towards mid
    }
    private static boolean isPalindrome2(Node<Integer> head){
        if(head==null){
            return true;
        }
        Node<Integer> midPoint = midPointLL(head);
        Node<Integer> reverseMidPoint = reverseLL(midPoint);
        while(reverseMidPoint!=null){
            if(!(head.data).equals(reverseMidPoint.data)){
                return false;
            }
            reverseMidPoint = reverseMidPoint.next;
            head = head.next;
        }
        return true;
    }
    private static Node<Integer> reverseLL(Node<Integer> midPoint) {
        if(midPoint==null){
            return null;
        }
        Node<Integer> prev = null;
        Node<Integer> curr = midPoint;
        Node<Integer> next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    private static Node<Integer> midPointLL(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
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
        Node<Integer> curr = slow;
        Node<Integer> prev = null;
        Node<Integer> fwd ;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        boolean isPalindrome = true;
        while(prev.next!=null){
            if(!(head.data).equals(prev.data)){
                isPalindrome = false;
            }
            prev = prev.next;
            head = head.next;
        }
        return isPalindrome;
    }
}
