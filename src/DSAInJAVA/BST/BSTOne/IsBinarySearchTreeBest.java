package DSAInJAVA.BST.BSTOne;

public class IsBinarySearchTreeBest {
    public static void main(String[] args) {
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
        System.out.println(isBinarySearchTreeBest(root));
        System.out.println(isBinarySearchTreeBest(root1));
    }
    private static boolean isBinarySearchTreeBest(BinaryTreeNode<Integer> root) {
        return isBinarySearchTreeBestHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean isBinarySearchTreeBestHelper(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data < minValue || root.data > maxValue) {
            return false;
        }
        return isBinarySearchTreeBestHelper(root.left, minValue, root.data - 1) &&
                isBinarySearchTreeBestHelper(root.right, root.data + 1, maxValue);
    }
}
