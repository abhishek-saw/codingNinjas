package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class DiameterOfBinaryTreeBetter {
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
        DiameterBinaryTreePair pairs = diameterOfBinaryTreeBetter(root);
        return pairs.diameter;
    }
    private static DiameterBinaryTreePair diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new DiameterBinaryTreePair(0,0);
        }

        DiameterBinaryTreePair leftPair = diameterOfBinaryTreeBetter(root.left);
        DiameterBinaryTreePair rightPair = diameterOfBinaryTreeBetter(root.right);
//        height will be max of 1 + left height and right height
        int height = 1 + Math.max(leftPair.height, rightPair.height);
//        diameter will be max of 1 + left height + right height , left diameter and right diameter
        int diameter =  Math.max(1 + leftPair.height+rightPair.height, Math.max(leftPair.diameter, rightPair.diameter));

        DiameterBinaryTreePair pairs = new DiameterBinaryTreePair(0,0);
        pairs.height = height;
        pairs.diameter = diameter;
        return pairs;
    }
}
