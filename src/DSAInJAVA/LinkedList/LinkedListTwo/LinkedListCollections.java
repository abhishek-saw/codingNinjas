package DSAInJAVA.LinkedList.LinkedListTwo;


import java.util.LinkedList;

public class LinkedListCollections {
    public static void main(String[] args) {
        //Doubly Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(9);
        linkedList.add(89);
        for (Integer l : linkedList){
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println(linkedList.get(1));
        linkedList.add(1,100);
        System.out.println(linkedList.get(1));
        linkedList.addFirst(80);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.size());
        for (Integer l : linkedList){
            System.out.print(l + " ");
        }
        System.out.println();
        linkedList.set(0,60);
        for (Integer l : linkedList){
            System.out.print(l + " ");
        }
        linkedList.remove();
        System.out.println();
        for (Integer l : linkedList){
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println(linkedList.isEmpty());
    }
}
