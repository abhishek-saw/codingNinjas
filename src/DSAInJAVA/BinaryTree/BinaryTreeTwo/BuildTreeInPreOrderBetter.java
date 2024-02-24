package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class BuildTreeInPreOrderBetter {
    public static void main(String[] args) {
//        Step 1 : Find the root[preorder 1st element]
//        Step 2 : Find the inorder of both left and right subtree[find root inorder]
//        Step 3 : Find the preorder of both left and right subtree[find the num left before root]
//        Step 4 : Use recursion to build left and right subtree
//        Step 5 : Connect root with both
        int[] preOrder = {1,2,4,5,3,6,7};
        int[] inOrder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTreeInPreOrder(preOrder,inOrder);
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
    }

    private static BinaryTreeNode<Integer> buildTreeInPreOrder(int[] preOrder, int[] inOrder) {
        //Time Complexity : O(N^2)
        return buildTreeInPreOrderHelper(preOrder,0,preOrder.length-1,
                inOrder,0,inOrder.length-1);
    }

    public static BinaryTreeNode<Integer> buildTreeInPreOrderHelper(int[] preOrder, int preOrderStart,
                   int preOrderEnd, int[] inOrder, int inOrderStart, int inOrderEnd) {
        if(preOrderStart>preOrderEnd || inOrderStart>inOrderEnd){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[preOrderStart]);
        int count = -1;
        for(int i = inOrderStart;i<= inOrderEnd;i++){
            if(inOrder[i]==preOrder[preOrderStart]){
                count = i;
                break;
            }
        }
        int leftInStart = inOrderStart;
        int leftPreStart = preOrderStart+1;
        int leftInEnd = count - 1;
        int leftPreEnd = leftPreStart + leftInEnd - leftInStart ;

        int rightPreStart = leftPreEnd+1;
        int rightPreEnd = preOrderEnd;
        int rightInStart = count+1;
        int rightInEnd = inOrderEnd;

        root.left = buildTreeInPreOrderHelper(preOrder,leftPreStart, leftPreEnd, inOrder, leftInStart, leftInEnd);
        root.right = buildTreeInPreOrderHelper(preOrder, rightPreStart, rightPreEnd, inOrder, rightInStart, rightInEnd);
        return root;
    }
}
