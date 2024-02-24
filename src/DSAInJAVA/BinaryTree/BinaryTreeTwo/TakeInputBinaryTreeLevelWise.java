package DSAInJAVA.BinaryTree.BinaryTreeTwo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputBinaryTreeLevelWise {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBinaryTreeLevelWise();
        System.out.println("BinaryTreePrintRecursively");
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        System.out.println("BinaryTreePrintLevelWise");
        BinaryTreePrintLevelWise.binaryTreePrintLevelWise(root);
    }
    public static BinaryTreeNode<Integer> takeInputBinaryTreeLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter root data: " );
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildQueue = new LinkedList<>();
        pendingChildQueue.add(root);
        while(!pendingChildQueue.isEmpty()){
            BinaryTreeNode<Integer> frontLeaf = pendingChildQueue.poll();
            System.out.println("Please enter left child of " + frontLeaf.data);
            int leftChild = s.nextInt();
            if(leftChild!=-1){
                BinaryTreeNode<Integer> leftBinaryTree = new BinaryTreeNode<>(leftChild);
                frontLeaf.left = leftBinaryTree;
                pendingChildQueue.add(leftBinaryTree);
            }
            System.out.println("Please enter right child of " + frontLeaf.data);
            int rightChild = s.nextInt();
            if(rightChild!=-1){
                BinaryTreeNode<Integer> rightBinaryTree = new BinaryTreeNode<>(rightChild);
                frontLeaf.right = rightBinaryTree;
                pendingChildQueue.add(rightBinaryTree);
            }
        }
        return root;
    }
}
