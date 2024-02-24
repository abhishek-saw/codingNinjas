package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
//      The diameter of a tree (sometimes called the width) is the
//      number of nodes on the longest path between two child nodes.
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
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        System.out.println("Diameter of Binary Tree: " + diameterOfBinaryTree(root));
    }
    private static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int diameter1 = 1 + heightOfTree(root.left) + heightOfTree(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(rightDiameter, leftDiameter), diameter1);
    }
    private static int heightOfTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
    }
}
