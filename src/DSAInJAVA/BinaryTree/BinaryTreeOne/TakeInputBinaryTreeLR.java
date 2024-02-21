package DSAInJAVA.BinaryTree.BinaryTreeOne;

import java.util.Scanner;

public class TakeInputBinaryTreeLR {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root1 = takeInputBinaryTreeLR();
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root1);

        BinaryTreeNode<Integer> root2 = takeInputBinaryTreeLRBetter(true,0,true);
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root2);

    }
    public static BinaryTreeNode<Integer> takeInputBinaryTreeLRBetter(boolean isRoot,int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data:");
        }
        else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }
            else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner  s = new Scanner(System.in);
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBinaryTreeLRBetter(false,root.data,true);
        BinaryTreeNode<Integer> rightChild = takeInputBinaryTreeLRBetter(false,root.data,false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static BinaryTreeNode<Integer> takeInputBinaryTreeLR(){
        System.out.print("Enter root data:");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBinaryTreeLR();
        BinaryTreeNode<Integer> rightChild = takeInputBinaryTreeLR();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}
