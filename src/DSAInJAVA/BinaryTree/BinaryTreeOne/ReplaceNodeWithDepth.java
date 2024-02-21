package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class ReplaceNodeWithDepth {
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
        System.out.println();
        replaceNodeWithDepth(root);
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
    }
    private static void replaceNodeWithDepth(BinaryTreeNode<Integer> root) {
        int k = 0;
        replaceNodeWithDepthK(root,k);
    }
    private static void replaceNodeWithDepthK(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return;
        }
        root.data = k;
        replaceNodeWithDepthK(root.left, k+1);
        replaceNodeWithDepthK(root.right,k+1);
    }
}
