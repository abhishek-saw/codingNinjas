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
//                System.out.println(temp.data);
                temp = temp.next;
                x++;
            }
//            printLLRecursively(newHead);
//            System.out.println();
//            printLLRecursively(temp);
//            System.out.println();
            if(temp==null){
                return newHead;
            }
            Node<Integer> newTemp = temp.next;
            int y = 0;
            while(y<N && newTemp!=null){
                newTemp = newTemp.next;
                y++;
            }
//            printLLRecursively(newTemp);
//            System.out.println();
            temp.next = newTemp;
//            printLLRecursively(temp);
            temp = temp.next;
        }
        return newHead;
    }
}
