package DSAInJAVA.BST.BSTOne;

public class IsBinarySearchTreeBetter {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(2);
        root.left = rootL;
        root.right = rootR;
        rootL.right = rootLR;
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> root1L = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> root1R = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> root1LL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> root1LR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> root1LLR = new BinaryTreeNode<>(7);
        root1.left = root1L;
        root1.right = root1R;
        root1L.left = root1LL;
        root1L.right = root1LR;
        root1LL.right = root1LLR;
        System.out.println(isBinarySearchTreeBetter(root));
        System.out.println(isBinarySearchTreeBetter(root1));
    }
    private static boolean isBinarySearchTreeBetter(BinaryTreeNode<Integer> root) {
        IsBSTReturn ans = isBinarySearchTreeBetterHelper(root);
        System.out.println(ans.isBST+" "+ ans.min+ " " + ans.max);
        return ans.isBST;
    }
    private static IsBSTReturn isBinarySearchTreeBetterHelper(BinaryTreeNode<Integer> root) {
        if(root==null){
            IsBSTReturn output = new IsBSTReturn();
            output.isBST = true;
            output.max = Integer.MIN_VALUE;
            output.min = Integer.MAX_VALUE;
            return output;
        }
        IsBSTReturn leftTree = isBinarySearchTreeBetterHelper(root.left);
        IsBSTReturn rightTree = isBinarySearchTreeBetterHelper(root.right);

        int minimum = Math.min(root.data,Math.min(leftTree.min,rightTree.min));
        int maximum = Math.max(root.data,Math.max(leftTree.max,rightTree.max));

        boolean isBST = true;
        if(leftTree.max>= root.data){
            isBST = false;
        }
        if(rightTree.min< root.data){
            isBST = false;
        }
        if(!leftTree.isBST){
            isBST = false;
        }
        if(!rightTree.isBST){
            isBST = false;
        }
        IsBSTReturn output = new IsBSTReturn();
        output.isBST = isBST;
        output.max = maximum;
        output.min = minimum;
        return output;
    }
}
