package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class BuildTreeInPostOrder {
    public static void main(String[] args) {
        int[] postOrder = {4, 5, 2, 6, 7, 3, 1};
        int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = buildTreeInPostOrder(postOrder, inOrder);
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
    }
    private static BinaryTreeNode<Integer> buildTreeInPostOrder(int[] postOrder, int[] inOrder) {
        return buildTreeIP(postOrder,0,postOrder.length-1,inOrder,0,inOrder.length-1);
    }

    private static BinaryTreeNode<Integer> buildTreeIP(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if(postStart>postEnd || inStart>inEnd){
            return null;
        }
        int rootData = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int count =0;
        for(int i = inStart;i<=inEnd;i++){
            if(inOrder[i] == rootData){
                count = i;
                break;
            }
        }
        int inStartLeft = inStart;
        int inEndLeft = count-1;
        int inStartRight = count+1;
        int inEndRight = inEnd;
        int postStartLeft = postStart;
        int postEndLeft = postStart+count-1-inStartLeft;
        int postStartRight = postEndLeft+1;
        int postEndRight = postEnd-1;
        root.left = buildTreeIP(postOrder,postStartLeft,postEndLeft,inOrder,inStartLeft,inEndLeft);
        root.right = buildTreeIP(postOrder,postStartRight,postEndRight,inOrder,inStartRight,inEndRight);
        return root;
    }
}