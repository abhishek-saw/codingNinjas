package DSAInJAVA.Trees;

import java.util.Scanner;

public class TreeTakeInput {
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        PrintTreeBest.printTree(root);
    }
    private static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter root data : ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(rootData);
        System.out.println("Please enter number of children for  " + root.data);
        int numChild = s.nextInt();
        for(int i = 0;i<numChild;i++){
            TreeNode<Integer> childNode = takeInput();
            root.children.add(childNode);
        }
        return root;
    }
}