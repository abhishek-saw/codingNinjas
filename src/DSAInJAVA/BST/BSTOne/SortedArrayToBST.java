package DSAInJAVA.BST.BSTOne;


public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        BinaryTreeNode<Integer> root = sortedArrayToBST(arr,arr.length);
        printBinaryTreeRecursivelyPreOrder(root);
    }
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int n) {
        return sortedArrayToBSTHelper(arr,0,n-1);
    }
    private static BinaryTreeNode<Integer> sortedArrayToBSTHelper(int[] arr, int start, int end) {
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = sortedArrayToBSTHelper(arr, start,mid-1);
        root.right = sortedArrayToBSTHelper(arr, mid+1, end);
        return root;
    }
    public static void printBinaryTreeRecursivelyPreOrder(BinaryTreeNode<Integer> root) {
        // prints root then all left child and then all right child -> PreOrder : ROOT LEFT RIGHT
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printBinaryTreeRecursivelyPreOrder(root.left);
        printBinaryTreeRecursivelyPreOrder(root.right);
    }
}
