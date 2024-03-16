package DSAInJAVA.BST.BSTTwo;

import java.util.ArrayList;

public class printNodesSumBSTBetter {
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
        printNodesSumToS(root, 12);
    }
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        // TIME COMPLEXITY : O(N*logN)
        // SPACE COMPLEXITY : O(N)
         if(root==null){
            return;
        }
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<Integer> newArrayList = bstToArrayList(root,path);
        System.out.println(newArrayList);
        int i = 0;
        int j = newArrayList.size()-1;
        while(i<j){
            if(newArrayList.get(i)+newArrayList.get(j)==s){
                System.out.println(newArrayList.get(i) + " " + newArrayList.get(j));
                j--;
                i++;
            }
            else if(newArrayList.get(i)+newArrayList.get(j)>s){
                j--;
            }
            else{
                i++;
            }
        }
    }
    private static ArrayList<Integer> bstToArrayList(BinaryTreeNode<Integer> root, ArrayList<Integer> path) {
        if (root == null) {
            return null;
        }
        bstToArrayList(root.left, path);
        path.add(root.data);
        bstToArrayList(root.right, path);
        return path;
    }
}