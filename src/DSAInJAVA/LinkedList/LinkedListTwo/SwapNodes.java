package DSAInJAVA.LinkedList.LinkedListTwo;

public class SwapNodes {
    public static void main(String[] args) {
//        input : 3 4 5 2 6 1 9 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        int i = 0;
        int j = 6;
        PrintLLRecursively.printLLRecursively(head);
        System.out.println();
        PrintLLRecursively.printLLRecursively(swapNodes(head,i,j));
    }

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(i==j){
            return head;
        }
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> node1 = null, node2=null, node1B=null, node2B=null;
        int pos = 0;
        while(curr!=null){
            if(pos==i){
                node1 = curr;
                node1B = prev;
            }
            else if(pos==j){
                node2 = curr;
                node2B = prev;
            }
            pos++;
            prev = curr;
            curr = curr.next;
        }

        if(node1B!=null){
            node1B.next = node2;
        }
        else {
            head = node2;
        }
        if(node2B!=null){
            node2B.next = node1;
        }
        else {
            head = node1;
        }
        Node<Integer> temp = node2.next;
        node2.next = node1.next;
        node1.next = temp;

        return head;
    }
}
