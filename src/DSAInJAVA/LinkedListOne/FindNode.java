package DSAInJAVA.LinkedListOne;

public class FindNode {
        public static void main(String[] args) {
            Node<Integer> n1 = new Node<>(8);
            Node<Integer> n2 = new Node<>(7);
            Node<Integer> n3 = new Node<>(4);
            Node<Integer> n4 = new Node<>(9);
            Node<Integer> n5 = new Node<>(1);
            Node<Integer> n6 = new Node<>(3);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            System.out.println(findNode(n1,9));

    }
    public static int findNode(Node<Integer> head, int n) {
            Node<Integer> temp = head;
            int node = 0;
            while(temp!=null){
                if(temp.data==n){
                    return node;
                }
                temp = temp.next;
                node++;
            }
        return -1;
    }
}
