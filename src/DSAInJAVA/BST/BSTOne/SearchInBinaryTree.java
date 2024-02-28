package DSAInJAVA.BST.BSTOne;

public class SearchInBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLL.right = rootLLR;
        System.out.println(searchInBST(root,2));
        System.out.println(searchInBST(root,13));
    }

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        // Time Complexity : O(h) where h is height of Binary Tree
        // h can be logN(Balanced Tree) or worst case N(Degenerate Tree)
        // => 1 + 2 + 4..... 2^(h-1)
        // => 2^h -1 = N
        // => h = logN
        if(root == null){ // BASE CASE
            return false;
        }
        if(k == root.data){
            return true;
        }
        else if (k < root.data){
            return searchInBST(root.left,k);
        }
        else {
            return searchInBST(root.right,k);
        }
    }
}
