package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class PrintNodesAtDepthK {
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
        int  k = 3;
        System.out.print("Nodes at depth " + k + ": ");
        printNodesAtDepthK(root,k);
    }

    private static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if(root == null || k<0){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
            return;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right, k-1);
    }
}
