package DSAInJAVA.BinaryTree.BinaryTreeOne;

public class CountNodesGreaterThanX {
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
        int num = 5;
        PrintBinaryTreeRecursively.printBinaryTreeRecursively(root);
        System.out.println("Count " + countNodesGreaterThanX(root,num));
    }

    private static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int num) {
        if(root==null){
            return 0;
        }
        int count = root.data > num ? 1 : 0;
        if(root.left!=null) {
            count+=countNodesGreaterThanX(root.left, num);
        }
        if(root.right!=null){
            count+=countNodesGreaterThanX(root.right, num);
        }
        return count;
    }
}
