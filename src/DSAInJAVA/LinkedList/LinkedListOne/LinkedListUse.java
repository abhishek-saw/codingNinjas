package DSAInJAVA.LinkedList.LinkedListOne;

public class LinkedListUse {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("n1 : " +n1 + " data : " + n1.data + " next" + n1.next);
        System.out.println("n2 : " +n2 + " data : " + n2.data + " next" + n2.next);
        System.out.println("n3 : " +n3 + " data : " + n3.data + " next" + n3.next);
        System.out.println("n4 : " +n4 + " data : " + n4.data + " next" + n4.next);
        return n1;
    }

    static void printLinkedList(Node<Integer> head) {
//        System.out.println("Print"+head);
//        System.out.println(head.data);
//        System.out.println(head.next);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
//        while(head!=null){
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        System.out.println(n1); // reference of the node
        System.out.println(n1.data);
        System.out.println(n1.next);
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
    }
}
