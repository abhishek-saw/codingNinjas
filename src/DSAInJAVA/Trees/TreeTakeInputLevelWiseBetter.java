package DSAInJAVA.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTakeInputLevelWiseBetter {
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        PrintTreeBest.printTree(root);
    }
    private static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter root data : ");
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currNode = pendingNodes.poll();
            System.out.println("Please enter number of children for " + currNode.data);
            int numChild = s.nextInt();
            for(int i =0;i<numChild;i++){
                System.out.println("Please enter the " + i + "th child data for "+ currNode.data);
                int childData = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                currNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }
}