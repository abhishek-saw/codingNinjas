package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class BuildTreeInPreOrder {
    public static void main(String[] args) {
//        Step 1 : Find the root[preorder 1st element]
//        Step 2 : Find the inorder of both left and right subtree[find root inorder]
//        Step 3 : Find the preorder of both left and right subtree[find the num of left before root]
//        Step 4 : Use recursion to build left and right subtree
//        Step 5 : Connect root with both
        int[] preOrder = {1,2,4,5,3,6,7};
        int[] inOrder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTreeInPreOrder(preOrder,inOrder);
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
    }

    private static BinaryTreeNode<Integer> buildTreeInPreOrder(int[] preOrder, int[] inOrder) {
        if(preOrder.length ==0 && inOrder.length==0){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[0]);
        int count = 0;
        for (int value : inOrder) {
            if (value == preOrder[0]) {
                break;
            }
            count++;
        }
//        building left inorder and right inorder
        int[] leftInOrder = new int[count];
        int[] rightInOrder = new int[inOrder.length - count -1];
        for(int j = 0;j<inOrder.length;j++){
            if(j<count){
                leftInOrder[j] = inOrder[j];
            }
            else if(j==count){
                continue;
            }
            else{
                rightInOrder[j-count-1] = inOrder[j];
            }
        }
//        building left preorder and right preorder
        int[] leftPreOrder = new int[count];
        int[] rightPreOrder = new int[preOrder.length - count - 1];
        for(int k=1;k< preOrder.length;k++){
            if(k<=count){
                leftPreOrder[k-1] = preOrder[k];
            }
            else{
                rightPreOrder[k-count-1] = preOrder[k];
            }
        }
        root.left = buildTreeInPreOrder(leftPreOrder,leftInOrder);
        root.right = buildTreeInPreOrder(rightPreOrder,rightInOrder);
        return root;
    }
}
