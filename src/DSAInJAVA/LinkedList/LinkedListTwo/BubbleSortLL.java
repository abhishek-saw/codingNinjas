package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class BubbleSortLL {
    public static void main(String[] args) {
//        While curr->next != NULL:
//        temp = head
//        size = 1 + length (temp-›next)
//        Return size

//        For i from 0 to length (head) exclusive:
//        prev = NULL, curr = head
//        While curr->next != NULL:
//        If curr-›data › curr-›next->data:
//          If prev != NULL:
//        temp = curr->next->next                + Store the next node after the next node
//        curr-next→>next = curr                 + Update the next of the next node to point to the current node
//        prev->next = curr->next                + Update the previous node to point to the next node
//        curr-›next = temp                      + Update the current node to point to the node after the next node
//        prev = prev-›next                      + Move the previous pointer to the next node
//          Else:
//        head = curr->next                      + Update the head to point to the next node
//        curr-›next = head-›next                + Update the current node to point to the node after the new head
//        head->next = curr                      + Update the new head to point to the current node
//        prev = head                            + Set the previous pointer to the new head
//        Else:
//        prev = curr;
//        curr = curr.next;
//
//
        Node<Integer> n1 = new Node<>(11);
        Node<Integer> n2 = new Node<>(17);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(10);
        Node<Integer> n5 = new Node<>(29);
        Node<Integer> n6 = new Node<>(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printLLRecursively(n1);
        System.out.println();
        printLLRecursively(bubbleSortLL(n1));
    }

    private static Node<Integer> bubbleSortLL(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        int lengthHead = lengthLL(head);
        for(int i=0;i<lengthHead;i++){
            Node<Integer> curr = head;
            Node<Integer> prev = null;
            while(curr.next!=null){
                if(curr.data>curr.next.data){
                    if(prev!=null){
                        Node<Integer> temp = curr.next.next;
                        curr.next.next = curr;
                        prev.next = curr.next;
                        curr.next = temp;
                        prev = prev.next;
                    }
                    else{
                        head = curr.next;
                        curr.next = head.next;
                        head.next = curr;
                        prev = head;
                    }

                }
                else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        }

        return head;
    }

    private static int lengthLL(Node<Integer> head) {
        if(head==null){
            return 0;
        }
        return  1+lengthLL(head.next);
    }
}
