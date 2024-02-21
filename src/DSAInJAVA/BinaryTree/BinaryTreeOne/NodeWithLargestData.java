package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class NodeWithLargestData {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(114);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("NodeWithLargestData: " + nodeWithLargestData(root));
    }

    private static int nodeWithLargestData(BinaryTreeNode<Integer> root) {
        if (root == null) { //BASE CASE
            return Integer.MIN_VALUE;
        }
        int rootMax = root.data; //root
        int largestDataLeft = nodeWithLargestData(root.left); //root Left max value
        int largestDataRight = nodeWithLargestData(root.right); //root Right max value
        return Math.max(rootMax, Math.max(largestDataLeft, largestDataRight)); //cool-cool compare
    }
}
