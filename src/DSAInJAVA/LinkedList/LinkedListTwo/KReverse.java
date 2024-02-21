package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class KReverse {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);
        Node<Integer> n6 = new Node<>(6);
        Node<Integer> n7 = new Node<>(7);
        Node<Integer> n8 = new Node<>(8);
        Node<Integer> n9 = new Node<>(9);
        Node<Integer> n10 = new Node<>(10);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        printLLRecursively(n1);
        System.out.println();
        int k = 4;
        printLLRecursively(kReverse(n1,k));
    }
    private static Node<Integer> kReverse(Node<Integer> head,int k) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> prev = null;
        Node<Integer> curr = head;
        Node<Integer> next = null;
        int count = 0;
//        System.out.println("nodeCount: " + nodeCount);
        if(k<=1){
            return head;
        }
        while(curr!=null && count<k){ // we are doing for first k elements, that why count<k
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = kReverse(next,k); // head will be reverse, so we can attach the head,next to the new iteration while calling Recursion for another k
        return prev;
    }
}
