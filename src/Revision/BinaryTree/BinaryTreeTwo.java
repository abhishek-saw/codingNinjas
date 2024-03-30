package Revision.BinaryTree;

public class BinaryTreeTwo {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(14);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        System.out.println("Remove Leaf Nodes");
        BinaryTreeOne.printBinaryTreeRecursively(root);
        BinaryTreeNode<Integer> newRoot = removeLeafNodes(root);
        System.out.println();
        BinaryTreeOne.printBinaryTreeRecursively(newRoot);
        System.out.println();
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootL1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR1 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLL1 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR1 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootRL1 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR1 = new BinaryTreeNode<>(7);
        root1.left = rootL1;
        root1.right = rootR1;
        rootL1.left = rootLL1;
        rootL1.right = rootLR1;
        rootR1.left = rootRL1;
        rootR1.right = rootRR1;
        System.out.println("Mirror Binary Tree");
        BinaryTreeOne.printBinaryTreeRecursively(root1);
        System.out.println();
        mirrorBinaryTree(root1);
        BinaryTreeOne.printBinaryTreeRecursively(root1);
        System.out.println("Is Binary Tree is balanced: " + checkBinaryTreeBalanced(root1));
        System.out.println("Is Binary Tree is balanced: " + checkBinaryTreeBalancedBetter(root1).isBal);
        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR2 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR2 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLLR2 = new BinaryTreeNode<>(9);
        root2.left = rootL2;
        root2.right = rootR2;
        rootL2.left = rootLL2;
        rootL2.right = rootLR2;
        rootLL2.right = rootLLR2;
        BinaryTreeOne.printBinaryTreeRecursively(root2);
        System.out.println("Diameter of Binary Tree: " + diameterOfBinaryTree(root2));
        System.out.println("Diameter of Binary Tree: " + diameterOfBinaryTreeBetter(root2).diameter);

    }
    private static BinaryTreeDiameterReturn diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new BinaryTreeDiameterReturn(0,0);
        }
        BinaryTreeDiameterReturn leftDiameter = diameterOfBinaryTreeBetter(root.left);
        BinaryTreeDiameterReturn rightDiameter = diameterOfBinaryTreeBetter(root.right);
        int height =   1 + Math.max(leftDiameter.height , rightDiameter.height);
        int diameter = 1 + Math.max(leftDiameter.height + rightDiameter.height,
                Math.max(leftDiameter.diameter, rightDiameter.diameter));
        return new BinaryTreeDiameterReturn(height,diameter);
    }

    private static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        int diameter = leftHeight + rightHeight + 1;
        return Math.max(diameter,
                Math.max(diameterOfBinaryTree(root.left),
                        diameterOfBinaryTree(root.right)));
    }
    private static BinaryTreeCheckBalancedReturn checkBinaryTreeBalancedBetter(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new BinaryTreeCheckBalancedReturn(0,true);
        }
        BinaryTreeCheckBalancedReturn leftOutput = checkBinaryTreeBalancedBetter(root.left);
        BinaryTreeCheckBalancedReturn rightOutput = checkBinaryTreeBalancedBetter(root.right);
        int height = 1 + Math.max(leftOutput.height , rightOutput.height);
        boolean isBal = Math.abs(leftOutput.height - rightOutput.height) <= 1;
        if(!leftOutput.isBal){
            isBal = false;
        }
        if(!rightOutput.isBal){
            isBal = false;
        }
        return new BinaryTreeCheckBalancedReturn(height,isBal);
    }
    private static boolean checkBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        return checkBinaryTreeBalanced(root.left) && checkBinaryTreeBalanced(root.right);
    }
    private static int heightTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
    }
    private static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }
    private static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }
        root.left = removeLeafNodes(root.left) ;
        root.right = removeLeafNodes(root.right) ;
        return root;
    }
}
