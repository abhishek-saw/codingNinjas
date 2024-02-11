package DSAInJAVA.LinkedList.LinkedListOneTwo;

public class PrintIthNode {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        printIthNode(n1,3);
    }

    private static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int index = 1;
        while(temp!=null){
            if(index == i){
                System.out.println(temp.data);
                break;
            }
            else{
                temp = temp.next;
                index++;
            }
        }
    }
}
