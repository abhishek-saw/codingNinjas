package DSAInJAVA.BST.BSTTwo;

public class LargestBSTSubtreeBest {
    public static class IsLargestBSTReturn {
        boolean isBST;
        int max;
        int min;
        int heightOfLargestBSTReturn;
        public IsLargestBSTReturn(boolean isBST, int max, int min, int heightOfLargestBSTReturn) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
            this.heightOfLargestBSTReturn = heightOfLargestBSTReturn;
        }
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
        return largestBSTSubtreeHelper(root).heightOfLargestBSTReturn;
    }
    private static IsLargestBSTReturn largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new IsLargestBSTReturn(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        IsLargestBSTReturn leftAnswer = largestBSTSubtreeHelper(root.left);
        IsLargestBSTReturn rightAnswer = largestBSTSubtreeHelper(root.right);
        int min  = Math.min(root.data, Math.min(leftAnswer.min,rightAnswer.min));
        int max  = Math.max(root.data, Math.max(leftAnswer.max,rightAnswer.max));
        int height = 1 + Math.max(leftAnswer.heightOfLargestBSTReturn,rightAnswer.heightOfLargestBSTReturn);
        boolean isBST = leftAnswer.isBST;
        if(!rightAnswer.isBST){
            isBST =false;
        }
        if(rightAnswer.min<root.data){
            isBST =false;
        }
        if(leftAnswer.max>root.data){
            isBST =false;
        }
        if(!isBST){
            height =  Math.max(leftAnswer.heightOfLargestBSTReturn,rightAnswer.heightOfLargestBSTReturn);
        }
        return new IsLargestBSTReturn(isBST, max, min, height);
    }
}
