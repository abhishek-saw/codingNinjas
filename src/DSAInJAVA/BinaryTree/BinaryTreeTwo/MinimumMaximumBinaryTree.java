package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class MinimumMaximumBinaryTree {

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
        BinaryPair<Integer,Integer> pair = minimumMaximumBinaryTree(root);
        System.out.println(pair.minimum+ " " + pair.maximum);
    }

    private static BinaryPair<Integer, Integer> minimumMaximumBinaryTree(BinaryTreeNode<Integer> root) {
        // Base Case:  If root null return min as MAX_VALUE and max as MIN_VALUE
        // compare for root data and set the min and max
        // recursively call on left and right side of the Binary tree
        // Return the pair as comparing max and min of left side and right side
        return getMinAndMax(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    private static BinaryPair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
        if(root==null){
            return new BinaryPair<>(minValue,maxValue);
        }
        if(root.data<minValue){
            minValue = root.data;
        }
        if(root.data>maxValue){
            maxValue = root.data;
        }
        BinaryPair<Integer,Integer> pair1 = getMinAndMax(root.left,minValue,maxValue);
        BinaryPair<Integer,Integer> pair2 = getMinAndMax(root.right,minValue,maxValue);
        BinaryPair<Integer,Integer> ans = new BinaryPair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        ans.maximum = pair1.maximum > pair2.maximum ? pair1.maximum : pair2.maximum;
        ans.minimum = pair1.minimum < pair2.minimum ? pair1.minimum : pair2.minimum;
        return ans;
    }

}
