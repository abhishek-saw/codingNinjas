package Revision.BinaryTree;

import java.util.Scanner;

public class BinaryTreeTakeInputRecursively {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = binaryTreeTakeInput();
        BinaryTreeOne.printBinaryTreeRecursively(root);
    }
    private static BinaryTreeNode<Integer> binaryTreeTakeInput() {
        return binaryTreeTakeInputHelper(true,0,false);
    }
    private static BinaryTreeNode<Integer> binaryTreeTakeInputHelper(boolean isRoot, int parentData, boolean isLeft) {
        if(isRoot){
            System.out.println("Please enter the root data: ");
        }
        else{
            if(isLeft){
                System.out.println("Please enter the left data for : " + parentData);
            }
            else{
                System.out.println("Please enter the right data for : " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = binaryTreeTakeInputHelper(false,rootData,true);
        root.right = binaryTreeTakeInputHelper(false,rootData,false);
        return root;
    }
}
