package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class PrintNodesWithoutSibling {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(9);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLL.right = rootLLR;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.print("Nodes Without Sibling: ");
        printNodesWithoutSibling(root);
    }

    private static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        if (root.left != null && root.right==null) {
            System.out.print(root.left.data + " ");
        } else if (root.left == null) {
            System.out.print(root.right.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}
