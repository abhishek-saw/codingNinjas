package DSAInJAVA.Trees;

public class TreeNodeHeightBetter {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(1);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        System.out.println(getTreeHeight(root));
    }
    private static int getTreeHeight(TreeNode<Integer> root) {
        // TIME COMPLEXITY : O(N)
        // SPACE COMPLEXITY : O(H)
        if(root==null) {
            return 0;
        }
        int ans = 0;
        for (TreeNode<Integer>  treeNode: root.children){
            int childHeight = getTreeHeight(treeNode);
            ans = Math.max(ans, childHeight);
        }
        return 1 + ans;
    }
}
