package DSAInJAVA.BST.BSTOne;

public class ConstructLinkedListBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLRR;
        System.out.println("BINARY TREE");
        printBT(root);
        System.out.println();
        System.out.println("LINKED LIST");
        LinkedListNode<Integer> head = constructLinkedListBST(root);
        printLinkedList(head);
    }
    private static LinkedListNode<Integer> constructLinkedListBST(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        // done so that it does not go empty
        LinkedListNode<Integer> head = new LinkedListNode<>(root.data);
        constructLinkedListBSTHelper(root,head);
        return head.next;
    }

    private static LinkedListNode<Integer> constructLinkedListBSTHelper(BinaryTreeNode<Integer> root, LinkedListNode<Integer> currNode) {
        if(root==null){
            return currNode;
        }
        if(root.left!=null) { // this is done to get unto left corner element
            currNode = constructLinkedListBSTHelper(root.left, currNode);
        }
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data); // create and pointing to next
        currNode.next = newNode;
        currNode = newNode;
        if(root.right!=null) { // this is done to get unto right corner element
            currNode = constructLinkedListBSTHelper(root.right, currNode);
        }
        return currNode;
    }
    private static void printLinkedList(LinkedListNode<Integer> head) {
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
    private static void printBT(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        printBT(root.left);
        System.out.print(root.data + " ");
        printBT(root.right);
    }
}
