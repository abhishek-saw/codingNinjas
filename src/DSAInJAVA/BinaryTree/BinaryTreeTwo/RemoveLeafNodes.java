package DSAInJAVA.BinaryTree.BinaryTreeTwo;


public class RemoveLeafNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(14);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        System.out.println("New Root");
        BinaryTreeNode<Integer> newRoot = removeLeafNodes(root);
        BinaryTreePrintRecursively.printBinaryTreeRecursively(newRoot);
    }

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) { //Base Case
            return null;
        }
        if (root.left == null && root.right == null) { // For Leaf Node
            return null;
        }
        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);
        return root;
    }
}
