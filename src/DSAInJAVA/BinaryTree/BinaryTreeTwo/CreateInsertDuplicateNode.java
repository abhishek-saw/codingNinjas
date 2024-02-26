package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class CreateInsertDuplicateNode {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(60);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.right = rootRL;
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        createInsertDuplicateNode(root);
        System.out.println();
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
    }

    private static void createInsertDuplicateNode(BinaryTreeNode<Integer> root) {
        // save the pointer of left of Binary tree node
        // create a new node using the data of Binary tree node
        // now point the left of Binary tree node to newNode
        // now connect the left of new node to the saved pointer of left of Binary tree node
        // recursively call on left of newNode and right side of the curr node
        if(root==null){
            return ;
        }
        BinaryTreeNode<Integer> left = root.left;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        root.left = newNode;
        newNode.left = left;
        createInsertDuplicateNode(newNode.left);
        createInsertDuplicateNode(root.right);
    }
}
