package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class CheckBinaryTreeBalanced {
    public static void main(String[] args) {
        // Definition of Balanced Tree:
        // If |height of left subtree - height of right subTree| <= 1 at each node.
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
        System.out.println("Is Binary Tree is balanced " + checkBinaryTreeBalanced(root));
    }
    public static boolean checkBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
        // Time Complexity : O(N^2) / O(NlogN)
        // T(n) = k*N + 2T(N/2){0 or 2 nodes only type tree , MergeSort}
        // or
        // T(n) = k*N + T(N-1){LL type tree , BubbleSort}
        // For Height : O(N)
        if(root == null){
            return true;
        }
        int heightLeft = heightOfTree(root.left);
        int heightRight = heightOfTree(root.right);
        if(Math.abs(heightLeft - heightRight)>1){
            return false;
        }
        boolean isLeftBalanced = checkBinaryTreeBalanced(root.left);
        boolean isRightBalanced = checkBinaryTreeBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
    }
    private static int heightOfTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left),heightOfTree(root.right));
    }
}
