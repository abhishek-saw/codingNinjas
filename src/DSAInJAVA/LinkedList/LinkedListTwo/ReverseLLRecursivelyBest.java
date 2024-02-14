package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class ReverseLLRecursivelyBest {
    public static void main(String[] args) {
        //        input: 1 2 3 4 5 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        Node<Integer> reversed1 = reverseLL(head);
        printLLRecursively(reversed1);
    }

    public static Node<Integer> reverseLL(Node<Integer> head) {
        if(head==null || head.next==null) {
            return head;
        }
        Node<Integer> reverseHead = reverseLL(head.next); // 2->3->4->5 into  5<-4<-3<-2
        Node<Integer> reverseTail = head.next;// 2
        reverseTail.next = head; // 2->1
        head.next = null; //1->null
        return reverseHead;
    }
}
