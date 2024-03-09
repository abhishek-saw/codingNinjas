package DSAInJAVA.BST.BSTTwo;

import java.util.ArrayList;

public class RootNodePathBST {
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
        ArrayList<Integer> ans = getPath(root,6);
        for (Integer integer: ans){
            System.out.print(integer + " ");
        }
    }
    private static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(data);
            return path;
        }
        else if(root.data>data) {
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if (leftOutput != null) {
                leftOutput.add(root.data);
            }
            return leftOutput;
        }
        else {
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if (rightOutput != null) {
                rightOutput.add(root.data);
            }
            return rightOutput;
        }
    }
}
