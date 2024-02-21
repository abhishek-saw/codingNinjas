package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class PrintBinaryTreeOrderWise {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        System.out.println("PreOrder Traversal "); // ROOT LEFT RIGHT
        preOrderBinaryTree(root);
        System.out.println();
        System.out.println("PostOrder Traversal "); // LEFT RIGHT ROOT
        postOrderBinaryTree(root);
        System.out.println();
        System.out.println("InOrder Traversal "); // LEFT ROOT RIGHT
        inOrderBinaryTree(root);
    }
    public static void inOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        inOrderBinaryTree(root.left);
        System.out.print(root.data + " ");
        inOrderBinaryTree(root.right);
    }
    public static void postOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        postOrderBinaryTree(root.left);
        postOrderBinaryTree(root.right);
        System.out.print(root.data + " ");
    }
    public static void preOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderBinaryTree(root.left);
        preOrderBinaryTree(root.right);
    }
}
