package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class DeleteNodeLLRecursively {
    public static void main(String[] args) {
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        int pos = 1;
        printLLRecursively(deleteNode(head,pos));
        // check for null
        // do for zero
        // call for n-1 with check
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            head = head.next;
            return head;
        }
        else{
            if(head.next!=null){
                head.next = deleteNode(head.next,pos-1);
            }
            return head;
        }
    }
}
