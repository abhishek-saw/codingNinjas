package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class MidPointLL {
    public static void main(String[] args) {
//        input : 1 2 3 4 5 -1
//        input : 1 2 3 4 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        printLLRecursively(midPointLL(head));
    }

    private static Node<Integer> midPointLL(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> temp1 = head;
        int length = 0;
        while(temp1!=null){
            length++;
            temp1 = temp1.next;
        }
        int mid;
        if(length%2==0){
            mid = length/2;
        }
        else {
            mid = length/2+1;
        }
        int pos = 1;
        Node<Integer> midPoint = head;
        while(pos<mid){
            pos++;
            midPoint = midPoint.next;
        }
        return midPoint;
    }
}
