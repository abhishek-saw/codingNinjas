package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MidPointLLSF {
    public static void main(String[] args) {
//        input : 1 2 3 4 5 6 -1
//        input : 10 22 10 26 11 7 8 1 23 5 1 -1
        Node<Integer> head = TakeInputLL.takeInput();
        printLLRecursively(head);
        System.out.println();
        printLLRecursively(midPointLL(head));
    }

    public static Node<Integer> midPointLL(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
