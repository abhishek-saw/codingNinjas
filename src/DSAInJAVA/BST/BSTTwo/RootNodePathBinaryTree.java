package DSAInJAVA.BST.BSTTwo;

import java.util.ArrayList;

public class RootNodePathBinaryTree {
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
        ArrayList<Integer> ans = printPathInBinaryTree(root,6);
        for (Integer integer: ans){
            System.out.print(integer + " ");
        }
    }
    private static ArrayList<Integer> printPathInBinaryTree(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) { //if root itself is the data
            ArrayList<Integer> path = new ArrayList<>();
            path.add(data);
            return path;
        }
        ArrayList<Integer> leftOutput = printPathInBinaryTree(root.left, data); //calling for left
        if(leftOutput!=null){ // it may be give the position unto the element
            leftOutput.add(root.data); // we have to add the current element also
            return leftOutput; // return unto the root and return
        }
        ArrayList<Integer> rightOutput = printPathInBinaryTree(root.right, data); //calling for left
        if(rightOutput!=null){ // it may be give the position unto the element
            rightOutput.add(root.data); // we have to add the current element also
            return rightOutput; // return unto the root and return
        }
        return null;
    }
}
