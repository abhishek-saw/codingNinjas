package DSAInJAVA.BST.BSTOne;

public class ElementsInRangeK1K2 {
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
        elementsInRangeK1K2(root,6,10);
    }
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1, int k2){
        // Time Complexity :  O(N)
        // Space Complexity: O(h)
        if (root==null){
            return;
        }
        if(root.data<k1){ // no need to call on left side
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else if(root.data>k2){ // no need to call on right side
            elementsInRangeK1K2(root.left,k1,k2);
        }
        else {
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data + " ");// this is done so that always the smallest of th number print first
            elementsInRangeK1K2(root.right,k1,k2);
        }
    }
}
