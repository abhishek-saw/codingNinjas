package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class PrintBinaryTreeRecursively {

    public static void printBinaryTreeRecursively(BinaryTreeNode<Integer> root) {
        if (root == null) { //BASE CASE
            return;
        }
        System.out.print(root.data + ": ");
        if(root.left!=null ){ // This is not base case, we're just taking care of left and right node
            System.out.print("L"+root.left.data);
        }
        if(root.right!=null){ // This is not base case, we're just taking care of left and right node
            System.out.print(",R"+root.right.data);
        }
        System.out.println();
        printBinaryTreeRecursively(root.left);
        printBinaryTreeRecursively(root.right);
    }
    public static void printBinaryTreeRecursivelyLR(BinaryTreeNode<Integer> root) {
        // prints root then all left child and then all right child -> PreOrder : ROOT LEFT RIGHT
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBinaryTreeRecursivelyLR(root.left);
        printBinaryTreeRecursivelyLR(root.right);
    }
}