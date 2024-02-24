package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class CheckBinaryTreeBalancedBetter {
    public static void main(String[] args) {
        // Definition of Balanced Tree:
        // If |height of left subtree - height of right subTree| <= 1 at each node.
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        BinaryTreePrintRecursively.printBinaryTreeRecursively(root);
        System.out.println("Is Binary Tree is balanced " + checkBinaryTreeBalancedBetter(root));
    }
    private static boolean checkBinaryTreeBalancedBetter(BinaryTreeNode<Integer> root) {
        // Time Complexity : O(N)
        CheckBalancedTreeReturn checkBalancedTreeReturn = checkBinaryTreeBalancedBetterReturn(root);
        return checkBalancedTreeReturn.isBalanced;
    }

    private static CheckBalancedTreeReturn checkBinaryTreeBalancedBetterReturn(BinaryTreeNode<Integer> root) {
         if(root==null){
//              It can be done in without initialization of BalancedTreeReturn
            int height = 0;
            boolean isBalanced = true;
            CheckBalancedTreeReturn ans = new CheckBalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBalanced;
            return ans;
        }
//         Recursion Call : It will return both height and isBalanced
//         It will start from leaf to root
        CheckBalancedTreeReturn leftOutput = checkBinaryTreeBalancedBetterReturn(root.left);
        CheckBalancedTreeReturn rightOutput = checkBinaryTreeBalancedBetterReturn(root.right);

//        constant work : Comparing height and isBalanced for current node
        boolean isBalanced = true;
//        newHeight to pass to above node
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

//        1. Compare for height difference
        if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBalanced = false;
        }

//        2. Compare for isBalanced
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBalanced = false;
        }

//        Both height and isBalanced will be passed to above node(right/left) after comparison
        CheckBalancedTreeReturn ans = new CheckBalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBalanced;
        return ans;
    }
}
