package DSAInJAVA.BST.BSTOne;

public class IsBinarySearchTree {
    public static void main(String[] args) {
//        3 1 5 -1 2 -1 -1 -1 -1

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(2);
        root.left = rootL;
        root.right = rootR;
        rootL.right = rootLR;
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> root1L = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> root1R = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> root1LL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> root1LR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> root1LLR = new BinaryTreeNode<>(7);
        root1.left = root1L;
        root1.right = root1R;
        root1L.left = root1LL;
        root1L.right = root1LR;
        root1LL.right = root1LLR;
        System.out.println(isBinarySearchTree(root));
        System.out.println(isBinarySearchTree(root1));
        // Time Complexity : O(N^2) / O(NlogN)
        // T(n) = k*N + 2T(N/2){0 or 2 nodes only type tree , MergeSort}
        // or
        // T(n) = k*N + T(N-1){LL type tree , BubbleSort}
        // For Height : O(N)
    }

    private static boolean isBinarySearchTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int max = maxLeft(root.left);
        int min = minRight(root.right);
        if(root.data<=max){
            return false;
        }
        if(root.data>min){
            return false;
        }
        return isBinarySearchTree(root.left) && isBinarySearchTree(root.right);
    }
    private static int minRight(BinaryTreeNode<Integer> node) {
        if(node==null){
            return Integer.MAX_VALUE;
        }
        int minL = minRight(node.left);
        int minR = minRight(node.right);
        return Math.min(node.data, Math.min(minL,minR));
    }
    private static int maxLeft(BinaryTreeNode<Integer> node) {
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int maxL = maxLeft(node.left);
        int maxR = maxLeft(node.right);
        return Math.max(node.data,Math.max(maxL,maxR));
    }
}
