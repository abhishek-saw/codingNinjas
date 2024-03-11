package DSAInJAVA.BST.BSTOne;

public class ReplaceWithLargerNodesSum {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLLR;
        printBST(root);
        System.out.println();
        replaceWithLargerNodesSum(root);
        printBST(root);
    }
    private static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        replaceWithLargerNodesSumHelper(root,0);
    }

    private static int replaceWithLargerNodesSumHelper(BinaryTreeNode<Integer> root, int sum) {
        if(root==null){
            return sum;
        }
        sum = replaceWithLargerNodesSumHelper(root.right, sum);
        sum+=root.data;
        root.data =sum;
        sum =replaceWithLargerNodesSumHelper(root.left, sum);
        return sum;
    }
    private static void printBST(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
    }
}
