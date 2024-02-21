package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class SumNodesBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        rootLeft.left = rootLL;
        rootLeft.right = rootLR;
        rootRight.left = rootRL;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("Sum of nodes : " + sumNodesBinaryTree(root));
    }

    private static int sumNodesBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int sumLeft = sumNodesBinaryTree(root.left);
        int sumRight = sumNodesBinaryTree(root.right);
        return root.data + sumLeft + sumRight;
    }
}
