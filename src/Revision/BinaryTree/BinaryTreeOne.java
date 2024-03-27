package Revision.BinaryTree;

public class BinaryTreeOne {
    public static void main(String[] args) {
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
        System.out.println("BinaryTree in Pattern");
        printBinaryTreeRecursively(root);
        System.out.println("PreOrder Traversal "); // ROOT LEFT RIGHT
        preOrderBinaryTree(root);
        System.out.println();
        System.out.println("PostOrder Traversal "); // LEFT RIGHT ROOT
        postOrderBinaryTree(root);
        System.out.println();
        System.out.println("InOrder Traversal "); // LEFT ROOT RIGHT
        inOrderBinaryTree(root);
        System.out.println();
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> rootL1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLL1 = new BinaryTreeNode<>(114);
        BinaryTreeNode<Integer> rootLR1 = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> rootRL1 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR1 = new BinaryTreeNode<>(7);
        root1.left = rootL1;
        root1.right = rootR1;
        rootL1.left = rootLL1;
        rootL1.right = rootLR1;
        rootR1.left = rootRL1;
        rootR1.right = rootRR1;
        int num = 5;
        int k = 2;
        System.out.println("Number of nodes: " + nodesBinaryTree(root1));
        System.out.println("Sum of nodes: " + sumNodesBinaryTree(root1));
        System.out.println("NodeWithLargestData: " + nodeWithLargestData(root1));
        System.out.println("Count: " + countNodesGreaterThanX(root1,num));
        System.out.println("Height of Binary Tree: " + heightOfBinaryTree(root1));
        System.out.println("Number of Leaf Nodes: " + numberOfLeafNodes(root1));
        System.out.print("Nodes at depth " + k + ": ");
        printNodesAtDepthK(root1,k);
        System.out.println();
        System.out.println("Replace Node With Depth ");
        printBinaryTreeRecursively(root1);
        System.out.println();
        replaceNodeWithDepth(root1);
        printBinaryTreeRecursively(root1);
        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR2 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR2 =  new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLLR2 = new BinaryTreeNode<>(9);
        root2.left = rootL2;
        root2.right = rootR2;
        rootL2.left = rootLL2;
        rootL2.right = rootLR2;
        rootLL2.right = rootLLR2;
        int x = 10;
        System.out.println("Is Node Present: " + isNodePresent(root2,x));
        System.out.print("Nodes Without Sibling: ");
        printNodesWithoutSibling(root2);
        System.out.println();
    }
    private static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data + " ");
        }
        if(root.left!=null && root.right==null){
            System.out.print(root.left.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
    private static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return false;
        }
        if(root.data ==x){
            return true;
        }
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
    }
    private static void replaceNodeWithDepth(BinaryTreeNode<Integer> root) {
        replaceNodeWithDepthHelper(root,0);
    }
    private static void replaceNodeWithDepthHelper(BinaryTreeNode<Integer> root, int i) {
        if(root==null){
            return;
        }
        root.data = i;
        replaceNodeWithDepthHelper(root.left,i+1);
        replaceNodeWithDepthHelper(root.right,i+1);
    }
    private static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if(root ==null){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
            return;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right,k-1);
    }
    private static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        if(root.left ==null && root.right==null){
            return 1;
        }
        return numberOfLeafNodes(root.left)+numberOfLeafNodes(root.right);
    }
    private static int heightOfBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1 + Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right));
    }
    private static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int num) {
        if(root==null){
            return 0;
        }
        int count = root.data>num ? 1:0;
        count+=countNodesGreaterThanX(root.left,num) + countNodesGreaterThanX(root.right,num);
        return count;
    }
    private static int nodeWithLargestData(BinaryTreeNode<Integer> root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(nodeWithLargestData(root.left),nodeWithLargestData(root.right)));
    }
    private static int sumNodesBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return root.data + sumNodesBinaryTree(root.left) + sumNodesBinaryTree(root.right);
    }
    private static int nodesBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1+nodesBinaryTree(root.left)+nodesBinaryTree(root.right);
    }
    public static void inOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        inOrderBinaryTree(root.left);
        System.out.print(root.data + " ");
        inOrderBinaryTree(root.right);
    }
    public static void postOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        postOrderBinaryTree(root.left);
        postOrderBinaryTree(root.right);
        System.out.print(root.data + " ");
    }
    public static void preOrderBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderBinaryTree(root.left);
        preOrderBinaryTree(root.right);
    }
    public static void printBinaryTreeRecursively(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data + ": ");
        if(root.left!=null){
            System.out.print("L" + root.left.data + " ");
        }
        if(root.right!=null){
            System.out.print("R" + root.right.data + " ");
        }
        System.out.println();
        printBinaryTreeRecursively(root.left);
        printBinaryTreeRecursively(root.right);
    }
}
