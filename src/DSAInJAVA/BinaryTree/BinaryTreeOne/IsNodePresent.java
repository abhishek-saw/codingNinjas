package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class IsNodePresent {
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
        int x = 101;
        System.out.println(isNodePresent(root,x));
    }

    private static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root ==null){
            return false;
        }
        if(root.data ==x){
            return true;
        }
        boolean isBoolean1 = isNodePresent(root.left,x);
        boolean isBoolean2 = isNodePresent(root.right, x);
        return isBoolean1 || isBoolean2;
    }
}
