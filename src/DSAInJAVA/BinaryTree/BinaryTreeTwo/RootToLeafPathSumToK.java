package DSAInJAVA.BinaryTree.BinaryTreeTwo;

import java.util.ArrayList;

public class RootToLeafPathSumToK {
    public static void main(String[] args) {
//        input : 2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
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
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k){
//        DFS : DEPTH SEARCH FIRST
//        2 3 4 4 - 1st RLLL
//        2 3
//        9 8 - 2nd RLR
//        2
//        6 - 3rd RRLR
        ArrayList<Integer> path = new ArrayList<>();
        rootToLeafPathsSumToKHelper(root,path,k);
    }
    private static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, ArrayList<Integer> path, int k) {
        if(root==null){
            return;
        }
        k = k - root.data; // remove the root first then check condition very important
        path.add(root.data); // add the root into the path
        if(root.left==null && root.right==null){ // check for leaf node
            if(k==0){
                for(Integer integer:path){
                    System.out.print(integer + " "); // print all element of the path
                }
                System.out.println();
            }
            path.remove(path.size()-1);
            // v.v. important step we remove the last element hence the search works
            // in such way it starts traversing the right node tree so remove the prev/last elements before it
            // 2 3 4 4 (all left) after removing it becomes 2 3 and right traversing starts
            return;
        }
        rootToLeafPathsSumToKHelper(root.left, path, k); // k is already update above so no issue
        rootToLeafPathsSumToKHelper(root.right, path, k);
        path.remove(path.size()-1); // same for this also
    }
}
