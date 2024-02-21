package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class NumberNodesBinaryTree {
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
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("Number of nodes : " + nodesBinaryTree(root));
    }

    private static int nodesBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int leftNodeCount = nodesBinaryTree(root.left);
        int rightNodeCount = nodesBinaryTree(root.right);
        return 1 + leftNodeCount + rightNodeCount;
    }
}
