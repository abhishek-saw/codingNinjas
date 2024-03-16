package DSAInJAVA.BST.BSTTwo;

public class LargestBSTSubtree {
    public static class IsBSTReturn {
        boolean isBST;
        int max;
        int min;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> n1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> n2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> n3 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> n4 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> n5 = new BinaryTreeNode<>(9);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n4.right = n5;
        System.out.println(largestBSTSubtree(root));
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        //TIME COMPLEXITY : O(n*h)
        if (root == null) {
            return 0;
        }
        if (isBinarySearchTree(root)) {
            return heightOfTree(root);
        } else {
            int left = largestBSTSubtree(root.left);
            int right = largestBSTSubtree(root.right);
            return Math.max(left, right);
        }
    }
    public static int heightOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }
    public static boolean isBinarySearchTree(BinaryTreeNode<Integer> root) {
        IsBSTReturn ans = isBinarySearchTreeBetterHelper(root);
        return ans.isBST;
    }
    private static IsBSTReturn isBinarySearchTreeBetterHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            IsBSTReturn output = new IsBSTReturn();
            output.isBST = true;
            output.max = Integer.MIN_VALUE;
            output.min = Integer.MAX_VALUE;
            return output;
        }
        IsBSTReturn leftTree = isBinarySearchTreeBetterHelper(root.left);
        IsBSTReturn rightTree = isBinarySearchTreeBetterHelper(root.right);
        int minimum = Math.min(root.data, Math.min(leftTree.min, rightTree.min));
        int maximum = Math.max(root.data, Math.max(leftTree.max, rightTree.max));
        boolean isBST = leftTree.max < root.data;
        if (rightTree.min < root.data) {
            isBST = false;
        }
        if (!leftTree.isBST) {
            isBST = false;
        }
        if (!rightTree.isBST) {
            isBST = false;
        }
        IsBSTReturn output = new IsBSTReturn();
        output.isBST = isBST;
        output.max = maximum;
        output.min = minimum;
        return output;
    }
}
