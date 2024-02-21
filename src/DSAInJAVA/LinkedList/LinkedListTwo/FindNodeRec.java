package DSAInJAVA.LinkedList.LinkedListTwo;

public class FindNodeRec {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        int n = 300;
        System.out.println(findNodeRecursively(n1,n));
    }

    private static int findNodeRecursively(Node<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        if((head.data).equals(n)){
            return 0;
        }
        int index = findNodeRecursively(head.next,n);
        if(index==-1){
            return -1;
        }
        else{
            return 1+index;
        }
    }
}
