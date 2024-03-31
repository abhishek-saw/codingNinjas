package Revision.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTwoAssignment {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR2 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR2 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLLR2 = new BinaryTreeNode<>(9);
        root2.left = rootL2;
        root2.right = rootR2;
        rootL2.left = rootLL2;
        rootL2.right = rootLR2;
        rootLL2.right = rootLLR2;
        System.out.println("CreateInsertDuplicateNode");
        BinaryTreeOne.printBinaryTreeRecursively(root2);
        createInsertDuplicateNode(root2);
        System.out.println();
        BinaryTreeOne.printBinaryTreeRecursively(root2);
        System.out.println();
        BinaryTreeNode<Integer> root3 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootL3 = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> rootR3 = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> rootLL3 = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> rootLR3 = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> rootRL3 = new BinaryTreeNode<>(60);
        root3.left = rootL3;
        root3.right = rootR3;
        rootL3.left = rootLL3;
        rootL3.right = rootLR3;
        rootR3.right = rootRL3;
        BinaryPair<Integer,Integer> pair1 = getMinAndMax1(root3);
        System.out.println("GetMinAndMax1 of BinaryTree");
        System.out.println("min: " + pair1.minimum+ " max: " + pair1.maximum);
        System.out.println();
        BinaryPair<Integer,Integer> pair2 = getMinAndMax2(root3);
        System.out.println("GetMinAndMax2 of BinaryTree");
        System.out.println("min: " + pair2.minimum+ " max: " + pair2.maximum);
        System.out.println();
        System.out.println("Level Order Traversal");
        printLevelWise(root3);
        System.out.println("RootToLeafPathsSumToK");
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(9);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootRRL = new BinaryTreeNode<>(6);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.right = rootRR;
        rootLL.left = rootLLL;
        rootRR.left = rootRRL;
        int k = 13;
        rootToLeafPathsSumToK(root,k);
        System.out.println();
        System.out.println("NodesAtDistanceK");
        BinaryTreeNode<Integer> root4 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL4 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR4 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL4 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR4 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLRR4 = new BinaryTreeNode<>(9);
        root4.left = rootL4;
        root4.right = rootR4;
        rootL4.left = rootLL4;
        rootL4.right = rootLR4;
        rootLR4.right = rootLRR4;
        int node = 3;
        int k1 = 1;
        nodesAtDistanceK(root4, node, k1);
    }

    private static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
       nodesAtDistanceKDownHelper(root,node,k);
    }
    private static int nodesAtDistanceKDownHelper(BinaryTreeNode<Integer> root, int node, int k) {
        if(root==null){
            return -1;
        }
        if(root.data==node){
            nodesAtDistanceKDown(root,k);
            return 0;
        }
        int leftDistance = nodesAtDistanceKDownHelper(root.left,node,k);
        if(leftDistance!=-1){
            if(leftDistance+1==k){
                System.out.println(root.data);
            }
            else{
                nodesAtDistanceKDown(root.right,k-leftDistance-2);
            }
            return leftDistance+1;
        }
        int rightDistance = nodesAtDistanceKDownHelper(root.right,node,k);
        if(rightDistance!=-1){
            if(rightDistance+1==k){
                System.out.println(root.data);
            }
            else{
                nodesAtDistanceKDown(root.left,k-rightDistance-2);
            }
            return rightDistance+1;
        }
        return -1;
    }
    private static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        nodesAtDistanceKDown(root.left,k-1);
        nodesAtDistanceKDown(root.right,k-1);
    }
    private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        rootToLeafPathsSumToKHelper(root, path, k);
    }
    private static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, ArrayList<Integer> path, int k) {
        if(root==null){
            return;
        }
        path.add(root.data);
        k = k - root.data;
        if(root.left==null && root.right==null){
            if(k==0){
                for(Integer integer:path){
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
            path.remove(path.size()-1);
            return;
        }
        rootToLeafPathsSumToKHelper(root.left, path, k);
        rootToLeafPathsSumToKHelper(root.right, path, k);
        path.remove(path.size()-1);
    }
    private static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        System.out.println(root.data);
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<>(null);
        queue.add(root);
        queue.add(temp);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> treeNode = queue.poll();
            if(treeNode!=temp){
                if(treeNode.left!=null){
                    System.out.print(treeNode.left.data + " ");
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    System.out.print(treeNode.right.data + " ");
                    queue.add(treeNode.right);
                }
            }
            if(queue.peek()==temp) {
                System.out.println();
                queue.poll();
                queue.add(temp);
            }
        }
    }
    public static BinaryPair<Integer, Integer> getMinAndMax1(BinaryTreeNode<Integer> root) {
        return getMinAndMaxHelper1(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
//      return getMinAndMaxHelper2(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    private static BinaryPair<Integer, Integer> getMinAndMaxHelper1(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
        if (root == null) {
            return new BinaryPair<>(minValue,maxValue);
        }
        if(root.data>maxValue){
            maxValue = root.data;
        }
        if(root.data<minValue){
            minValue = root.data;
        }
        BinaryPair<Integer,Integer> leftOutput = getMinAndMaxHelper1(root.left,minValue,maxValue);
        BinaryPair<Integer,Integer> rightOutput = getMinAndMaxHelper1(root.right,minValue,maxValue);
        minValue = Math.min(leftOutput.minimum, rightOutput.minimum);
        maxValue = Math.max(leftOutput.maximum, rightOutput.maximum);
        return new BinaryPair<>(minValue,maxValue);
    }
    public static BinaryPair<Integer, Integer> getMinAndMax2(BinaryTreeNode<Integer> root) {
        return getMinAndMaxHelper2(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    private static BinaryPair<Integer, Integer> getMinAndMaxHelper2(BinaryTreeNode<Integer> root, int minValue, int maxValue) {
        if (root == null) {
            return new BinaryPair<>(minValue, maxValue);
        }
        BinaryPair<Integer, Integer> leftOutput = getMinAndMaxHelper2(root.left, minValue, root.data);
        BinaryPair<Integer, Integer> rightOutput = getMinAndMaxHelper2(root.right, root.data, maxValue);
        minValue = Math.min(leftOutput.minimum, rightOutput.minimum);
        maxValue = Math.max(leftOutput.maximum, rightOutput.maximum);
        return new BinaryPair<>(minValue, maxValue);
    }
    private static void createInsertDuplicateNode (BinaryTreeNode < Integer > root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
        BinaryTreeNode<Integer> treeNode = new BinaryTreeNode<>(root.data);
        root.left = treeNode;
        treeNode.left = temp;
        createInsertDuplicateNode(treeNode.left);
        createInsertDuplicateNode(root.right);
    }
}
