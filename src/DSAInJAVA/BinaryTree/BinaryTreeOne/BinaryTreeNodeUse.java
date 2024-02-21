package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class BinaryTreeNodeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        rootLeft.left = rootLL;
        rootLeft.right = rootLR;
        rootRight.left = rootRL;
        System.out.println("BinaryTree in Left-Right Pattern");
        PrintBinaryTreeRecursively.printBinaryTreeRecursivelyLR(root);
        System.out.println();
        System.out.println("BinaryTree in Pattern");
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
    }
}
