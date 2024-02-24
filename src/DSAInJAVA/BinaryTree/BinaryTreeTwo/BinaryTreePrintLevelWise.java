package DSAInJAVA.BinaryTree.BinaryTreeTwo;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrintLevelWise {
    public static void main(String[] args) {
//        input : 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
        BinaryTreeNode<Integer> root = TakeInputBinaryTreeLevelWise.takeInputBinaryTreeLevelWise();
        binaryTreePrintLevelWise(root);
    }
    public static void binaryTreePrintLevelWise(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> integerQueue = new LinkedList<>();
        integerQueue.add(root);
        while(!integerQueue.isEmpty()){
            BinaryTreeNode<Integer> leafNode = integerQueue.poll();
            System.out.print(leafNode.data+":");
            if(leafNode.left!=null) {
                System.out.print("L:" + leafNode.left.data);
                integerQueue.add(leafNode.left);
            }
            else{
                System.out.print("L:-1");
            }
            if(leafNode.right!=null) {
                System.out.print(",R:" + leafNode.right.data);
                integerQueue.add(leafNode.right);
            }
            else{
                System.out.print(",R:-1");
            }
            System.out.println();
        }
    }
}
