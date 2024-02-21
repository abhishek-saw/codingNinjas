package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLRR = new BinaryTreeNode<>(9);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLRR;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("Height of Binary Tree : " + heightOfBinaryTree(root));
        System.out.println("Height of Binary Tree : " + heightOfBinaryTreeBetter(root));

    }

    private static int heightOfBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null) {
            return 0;
        }
        int count = 0;
        count++;
        int leftHeight = 0;
        int rightHeight = 0;
        if(root.left!=null){
            leftHeight = heightOfBinaryTree(root.left);
        }
        if(root.right!=null){
            rightHeight = heightOfBinaryTree(root.right);
        }
        count+=Math.max(leftHeight,rightHeight);
        return count;
    }
    private static int heightOfBinaryTreeBetter(BinaryTreeNode<Integer> root) {
        if(root==null) {
            return 0;
        }
        return 1 + Math.max( heightOfBinaryTree(root.left),heightOfBinaryTree(root.right));
    }
}
