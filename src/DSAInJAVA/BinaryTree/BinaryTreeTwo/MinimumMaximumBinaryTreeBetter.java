package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class MinimumMaximumBinaryTreeBetter {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(60);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.right = rootRL;
        BinaryPair<Integer,Integer> pair = getMinAndMax(root);
        System.out.println(pair.minimum+ " " + pair.maximum);
    }
    private static BinaryPair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        // Base Case:  If root null return min as MAX_VALUE and max as MIN_VALUE
        // recursively call on left and right side of the Binary tree
        // Return the pair as comparing max and min of left side and right side with root data
        if(root==null){
            return new BinaryPair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        BinaryPair<Integer,Integer> pair1 = getMinAndMax(root.left);
        BinaryPair<Integer,Integer> pair2 = getMinAndMax(root.right);
        int minValue = Math.min(root.data, Math.min(pair1.minimum, pair2.minimum));
        int maxValue = Math.max(root.data, Math.max(pair1.maximum, pair2.maximum));
        return new BinaryPair<>(minValue,maxValue);
    }
}
