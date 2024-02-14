package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;


public class ReverseLLIteratively {
    public static void main(String[] args) {
        //        input: 1 2 3 4 5 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        Node<Integer> reversed = reverseLLIteratively(head);
        printLLRecursively(reversed);
    }

    public static Node<Integer> reverseLLIteratively(Node<Integer> head) {
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> fwd  = null;
        while(curr!=null){
            fwd = curr.next; // to save the future reference
            curr.next = prev; // to reserve the LL
            prev = curr; //to move the pev to curr
            curr = fwd; // to move the curr to next
        }
        return prev;
    }
}
