package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class ReverseLLRecursively {
    public static class DoubleNode {
        Node<Integer> head;
        Node<Integer> tail;
        public DoubleNode(Node<Integer> head,Node<Integer>tail){
            this.head = head;
            this.tail = tail;
        }
        public DoubleNode(){
        }
    }

    public static void main(String[] args) {
        //        input: 1 2 3 4 5 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        Node<Integer> reversed1 = reverseLL1(head);
        printLLRecursively(reversed1);
        Node<Integer> reversed2 = reverseLL2(head);
        printLLRecursively(reversed2);
    }

    public static Node<Integer> reverseLL1(Node<Integer> head) {
//        TimeComplexity : O(N^2)
        if(head==null || head.next == null){ //base case imp.
            return head;
        }
//        reversedNode : it will use magic and reverse the Linked List [smaller list]
        Node<Integer> reversedNode = reverseLL1(head.next);
        Node<Integer> tail = reversedNode;
//         now it's time to add the first head/element to the reversedNode(at the end)
        while (tail.next!=null){ //getting to the end of reversedNode
            tail = tail.next;
        }
        tail.next = head; //adding head to the end of small head
        head.next = null;
        return reversedNode; //returning the new head
    }
    public static Node<Integer> reverseLL2(Node<Integer> head){
        //        TimeComplexity : O(N)
        return reverseLL3(head).head;
    }
    public static DoubleNode reverseLL3(Node<Integer> head) {
//        TimeComplexity : O(N)
        DoubleNode answer ;
        if(head==null || head.next == null){
            answer = new DoubleNode();
            answer.head = head;
            answer.tail = head;
            return answer;
        }
//        This double node will have both head and tail of reversed LL
//        reversedNode : it will use magic and reverse the LL(smaller list) and give us head and tail
        DoubleNode reversedNode = reverseLL3(head.next);
//        now it's time to add the first head/element to the reversedNode(at the end)
        reversedNode.tail.next = head; // same work as reverseLL1
        head.next = null; // same work as reverseLL1
        answer = new DoubleNode(); // creating Double Node for answer
        answer.head = reversedNode.head;
        answer.tail = reversedNode.tail.next;
        return answer;
//        answer can be created in one line
//        return new DoubleNode(reversedNode.head,reversedNode.tail.next);;
    }
}
