package Revision.LinkedListOne;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        System.out.println(n1 + " " + n1.data + " " + n1.next);

        Node<Integer> head = createLinkedList();
        System.out.println("printLinkedList");
        printLinkedList(head);

        System.out.println("printLinkedListRecursively");
        printLinkedListRecursively(head);
        System.out.println();

        System.out.println("printLinkedListReverseRecursively");
        printLinkedListReverseRecursively(head);
        System.out.println();

        System.out.println("incrementLinkedList");
        increment(head);
        printLinkedList(head);

        System.out.println("lengthLinkedList");
        System.out.println(lengthLinkedListRecursively(head));

    }

    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("n1 : " +n1 + " data " + n1.data + " next " + n1.next);
        System.out.println("n2 : " +n2 + " data " + n2.data + " next " + n2.next);
        System.out.println("n3 : " +n3 + " data " + n3.data + " next " + n3.next);
        System.out.println("n4 : " +n4 + " data " + n4.data + " next " + n4.next);
        return n1;
    }
    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printLinkedListRecursively(Node<Integer> head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printLinkedListRecursively(head.next);
    }
    public static void printLinkedListReverseRecursively(Node<Integer> head) {
        if(head == null){
            return;
        }
        printLinkedListReverseRecursively(head.next);
        System.out.print(head.data + " ");
    }
    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int lengthLinkedListRecursively(Node<Integer> head){
        if(head==null){
            return 0;
        }
        return 1 + lengthLinkedListRecursively(head.next);
    }

}
