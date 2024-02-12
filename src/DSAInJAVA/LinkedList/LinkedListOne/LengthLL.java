package DSAInJAVA.LinkedList.LinkedListOne;

public class LengthLL {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(length(n1));
    }

    private static int length(Node<Integer> head) {
        int i = 0;
        while(head!=null){
            i++;
            head = head.next;
        }
        return i;
    }
}
