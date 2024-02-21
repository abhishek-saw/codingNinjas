package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class NumberOfLeafNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(9);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLL.right = rootLLR;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("Number of Leaf Nodes " + numberOfLeafNodes(root));
    }

    private static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        if(root.right ==null && root.left==null) {
            return 1;
        }
        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
    }
}
