package DSAInJAVA.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTakeInputLevelWise {
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
            System.out.println("Please enter the child of " + currNode.data);
            int m = s.nextInt();
            while(m!=-1){
                TreeNode<Integer> childNode = new TreeNode<>(m);
                currNode.children.add(childNode);
                pendingNodes.add(childNode);
                m = s.nextInt();
            }
        }
        return root;
    }
}
