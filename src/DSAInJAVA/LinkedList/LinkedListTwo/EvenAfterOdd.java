package DSAInJAVA.LinkedList.LinkedListTwo;

import static DSAInJAVA.LinkedList.LinkedListTwo.PrintLLRecursively.printLLRecursively;

public class EvenAfterOdd {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(4);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(7);
        Node<Integer> n4 = new Node<>(8);
        Node<Integer> n5 = new Node<>(3);
        Node<Integer> n6 = new Node<>(36);
        Node<Integer> n7 = new Node<>(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        printLLRecursively(n1);
        System.out.println();
        printLLRecursively(evenAfterOdd(n1));
        printLLRecursively(evenOdd(n1));
    }
    private static Node<Integer> evenOdd(Node<Integer> head){
        if(head==null){
            return null;
        }
        Node<Integer> oddHead = null;
        Node<Integer> oddTail ;
        Node<Integer> evenHead = null;
        Node<Integer> evenTail ;
        Node<Integer> temp = head;
        if(temp.data%2!=0){
            oddHead = temp;
        }
        else{
            evenHead = temp;
        }
        oddTail = oddHead;
        evenTail = evenHead;
        temp = temp.next;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenHead==null){
                    evenHead = temp;
                    evenTail = evenHead;
                }
                else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            }
            else{
                if(oddHead==null){
                    oddHead = temp;
                    oddTail = oddHead;
                }
                else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }
        if(evenTail!=null){
            evenTail.next = null;
        }
        if(oddTail!=null){
            oddTail.next = evenHead;
        }
        if(oddHead==null){
            return evenHead;
        }
        else{
            return oddHead;
        }
    }
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> tempEvenHead = null,tempEvenTail = null;
        Node<Integer> tempOddHead = null,tempOddTail = null;
        if(temp.data%2==0){
            tempEvenTail = temp;
            tempEvenHead = tempEvenTail;
        }
        else{
            tempOddTail  = temp;
            tempOddHead= temp;
        }
        temp = temp.next;
        while(temp!=null){
            if(temp.data%2==0){
                if(tempEvenHead==null){
                    tempEvenTail = temp;
                    tempEvenHead = temp;
                }
                else {
                    tempEvenTail.next = temp;
                    tempEvenTail = tempEvenTail.next;
                }
            }
            else{
                if(tempOddHead==null){
                    tempOddTail = temp;
                    tempOddHead = temp;
                }
                else {
                    tempOddTail.next = temp;
                    tempOddTail = tempOddTail.next;
                }
            }
            temp = temp.next;
        }

        if(tempOddHead==null){
            return tempEvenHead;
        }
        else {
            tempOddTail.next = tempEvenHead;
        }
        if (tempEvenHead != null) { // to break any connection between even or odd;
            tempEvenTail.next = null;
        }
        return tempOddHead;
    }
}
