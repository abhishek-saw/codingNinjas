package DSAInJAVA.LinkedList.LinkedListTwo;



public class PrintLLRecursively {
    public static void main(String[] args) {
        Node<Integer> head = TakeInputLL.takeInputOptimized();
        printLLRecursively(head);
    }
    public static void printLLRecursively(Node<Integer> head) {
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        printLLRecursively(head.next);
//        It will print the LL in reverse
//        System.out.print(head.data + " ");
    }

}
