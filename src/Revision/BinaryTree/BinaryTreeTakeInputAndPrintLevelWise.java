package Revision.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeTakeInputAndPrintLevelWise {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = binaryTreeTakeInputLevelWise();
        BinaryTreeOne.printBinaryTreeRecursively(root);
        printBinaryTreeLevelWise(root);
    }
    private static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> binaryTreeNodes = new LinkedList<>();
        binaryTreeNodes.add(root);
        while(!binaryTreeNodes.isEmpty()){
            BinaryTreeNode<Integer> temp = binaryTreeNodes.poll();
            System.out.print(temp.data + ":L:" );
            if(temp.left!=null){
                System.out.print(temp.left.data + ",R:");
                binaryTreeNodes.add(temp.left);
            }
            else {
                System.out.print("-1,R:");
            }
            if(temp.right!=null){
                System.out.print(temp.right.data);
                binaryTreeNodes.add(temp.right);
            }
            else {
                System.out.print("-1");
            }
            System.out.println();
        }

    }
    private static BinaryTreeNode<Integer> binaryTreeTakeInputLevelWise() {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the root data : ");
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> integerQueue  =  new LinkedList<>();
        integerQueue.add(root);
        while(!integerQueue.isEmpty()){
            BinaryTreeNode<Integer> temp = integerQueue.poll();
            System.out.println("Please enter left node of " + temp.data);
            int leftData = s.nextInt();
            if(leftData!=-1){
                temp.left = new BinaryTreeNode<>(leftData);
                integerQueue.add(temp.left);
            }
            System.out.println("Please enter right node of " + temp.data);
            int rightData = s.nextInt();
            if(rightData!=-1){
                temp.right = new BinaryTreeNode<>(rightData);
                integerQueue.add(temp.right);
            }
        }
        return root;
    }
}
