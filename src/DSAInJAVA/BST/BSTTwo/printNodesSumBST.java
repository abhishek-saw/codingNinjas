package DSAInJAVA.BST.BSTTwo;

public class printNodesSumBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLLR;
        printNodesSumToS(root,12);
    }
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        printNodesSumToSHelper(root,root,s);
    }
    public static void printNodesSumToSHelper(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> integerBinaryTreeNode, int s) {
        // TIME COMPLEXITY : O(N*LOGN)
        if (root == null) {
            return;
        }
        int num = s-root.data;
        boolean isNumPresent = getSumData(integerBinaryTreeNode,num);
        if(isNumPresent){
            if(num!=root.data) {
                if(root.data<num) {
                    System.out.println(root.data + " " + num);
                } else {
                    System.out.println(num + " " + root.data);
                }
                root.data=0;
            }
        }
        printNodesSumToSHelper(root.left, integerBinaryTreeNode, s);
        printNodesSumToSHelper(root.right, integerBinaryTreeNode, s);
    }
    private static boolean getSumData(BinaryTreeNode<Integer> root, int i) {
        if(root==null){
            return false;
        }
        if(root.data==i){
            return true;
        } else if(root.data>i){
            return getSumData(root.left,i);
        } else {
            return getSumData(root.right,i);
        }
    }
}
