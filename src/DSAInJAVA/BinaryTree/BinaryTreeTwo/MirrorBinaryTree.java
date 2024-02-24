package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class MirrorBinaryTree {
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
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        mirrorBinaryTree(root);
        System.out.println("Mirror Binary Tree");
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        mirrorBinaryTreeBetter(root);
        System.out.println("Mirror Binary Tree");
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
    }
    private static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if(root ==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left == null) {
            root.left = root.right;
            root.right = null;
        } else if (root.right == null){
            root.right = root.left;
            root.left = null;
        }
        else{
            BinaryTreeNode<Integer> integerBinaryTreeNode = root.right;
            root.right = root.left;
            root.left = integerBinaryTreeNode;
        }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }
    private static void mirrorBinaryTreeBetter(BinaryTreeNode<Integer> root) {
        if(root ==null){
            return;
        }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> integerBinaryTreeNode = root.right;
        root.right = root.left;
        root.left = integerBinaryTreeNode;
    }
}
