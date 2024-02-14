package DSAInJAVA.LinkedList.LinkedListTwo;


import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class InsertNodeLLRecursively {
    public static void main(String[] args) {
//        input: 2 6 9 15 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        int pos = 0;
        int data  = 20;
        System.out.println();
        printLLRecursively(insertRecursively(head,pos,data));
        // check for null
        //do for zero
        //call for n-1 with check
    }

    public static Node<Integer> insertRecursively(Node<Integer> head, int pos, int data) {
        if(head==null && pos>0){
            return null;
        }
        if(pos==0){
            Node<Integer> newHead = new Node<>(data);
            newHead.next = head;
            return newHead;
        }
        else{
            if(head.next!=null){
                head.next = insertRecursively(head.next,pos-1,data);
            }
            return head;
        }
    }
}