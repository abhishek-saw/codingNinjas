package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class SkipMDeleteN {
    public static void main(String[] args) {
        //        input: 1 2 3 4 5 6 7 8 -1
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
        System.out.println();
        int M = 2;
        int N = 3;
        printLLRecursively(skipMDeleteN(head,M,N));
        System.out.println();
        int M1 = 1;
        int N1 = 1;
        printLLRecursively(skipMDeleteNBetter(head,M1,N1));
    }
    private static Node<Integer> skipMDeleteNBetter(Node<Integer> head, int M, int N) {
        if (head == null || M == 0) {
            return null;
        }
        Node<Integer> temp = head;
        Node<Integer> newHead = null;
        Node<Integer> newTail = null;
        while (temp != null) {
            int count1 = 0;
            while (count1 < M && temp != null) {
                if (newHead == null) {
                    newHead = temp;
                    newTail = newHead;
                    temp = temp.next;
                }
                else {
                    newTail.next = temp;
                    temp = temp.next;
                    newTail = newTail.next;
                    newTail.next = null;
                }
                count1++;
            }
            int count2 = 0;
            while (count2 < N && temp != null) {
                temp = temp.next;
                count2++;
            }
        }
        return newHead;
    }
    private static Node<Integer> skipMDeleteN(Node<Integer> head, int M, int N) {
        if(head==null || M==0){
            return null;
        }
        Node<Integer> temp = head;
        Node<Integer> newHead = temp;
        while(temp!=null){
            int x = 1;
            while(x<M && temp!=null){
                temp = temp.next;
                x++;
            }
            if(temp==null){
                return newHead;
            }
            Node<Integer> newTemp = temp.next;
            int y = 0;
            while(y<N && newTemp!=null){
                newTemp = newTemp.next;
                y++;
            }
            temp.next = newTemp;
            temp = temp.next;
        }
        return newHead;
    }
}
