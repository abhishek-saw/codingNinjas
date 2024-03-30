package Revision.BinaryTree;

public class BinaryTreeUsingInPost {
    public static void main(String[] args) {
        int[] postOrder = {4, 5, 2, 6, 7, 3, 1};
        int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder);
        BinaryTreeOne.printBinaryTreeRecursively(root);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        return buildTreeHelper(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if(postStart>postEnd || inStart>inEnd) {
            return null;
        }
        int rootData = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int pos = 0;
        for(int i =inStart;i<=inEnd;i++){
            if(inOrder[i] == rootData){
                pos = i;
                break;
            }
        }
        root.left = buildTreeHelper(postOrder,postStart,postStart+pos-inStart-1,inOrder,inStart,pos-1);
        root.right = buildTreeHelper(postOrder,postStart+pos-inStart,postEnd-1,inOrder,pos+1,inEnd);
        return root;
    }

}