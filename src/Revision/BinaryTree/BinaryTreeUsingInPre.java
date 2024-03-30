package Revision.BinaryTree;

public class BinaryTreeUsingInPre {
    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 5, 3, 6, 7};
        int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
        BinaryTreeOne.printBinaryTreeRecursively(root);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return buildTreeHelper(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
    }

    private static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preStart, int preEnd,
                                                           int[] inOrder, int inStart, int inEnd) {
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int rootData = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int pos = -1;
        for(int i =inStart;i<=inEnd;i++){
            if(inOrder[i]==preOrder[preStart]){
                pos = i;
                break;
            }
        }
        root.left = buildTreeHelper(preOrder,preStart+1,preStart+pos-inStart,inOrder,inStart,pos-1);
        root.right = buildTreeHelper(preOrder,preStart+pos+1-inStart,preEnd,inOrder,pos+1,inEnd);
        return root;
    }
}
