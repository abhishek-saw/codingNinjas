package DSAInJAVA.BST.BSTOne;

import java.util.ArrayList;
import java.util.Objects;

public class LCABST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLRR;
        int a = 2;
        int b = 6;
        System.out.println(getLCA(root, a, b));
    }
    private static int getLCA(BinaryTreeNode<Integer> root,int a, int b){
        if (root == null) {
            return -1;
        }
        ArrayList<Integer> path1 = getPath(root, a);
        ArrayList<Integer> path2 = getPath(root, b);
        if(path1!=null && path2!=null){
            for (Integer integer:path1){
                System.out.print(integer + " ");
            }
            System.out.println();
            for (Integer integer:path2){
                System.out.print(integer + " ");
            }
            System.out.println();
            return findData(path1,path1.size(), path2,path2.size());
        }
        return -1;
    }
    private static int findData(ArrayList<Integer> path1,int size1, ArrayList<Integer> path2,int size2) {
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (Objects.equals(path1.get(i), path2.get(j))) {
                    return path1.get(i);
                }
            }
        }
        return -1;
    }
    private static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(data);
            return ans;
        }
        else if(root.data>data) {
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if (leftOutput != null) {
                leftOutput.add(root.data);
            }
            return leftOutput;
        }
        else {
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if (rightOutput != null) {
                rightOutput.add(root.data);
            }
            return rightOutput;
        }
    }
}
