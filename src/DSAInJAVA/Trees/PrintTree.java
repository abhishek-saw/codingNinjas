package DSAInJAVA.Trees;

public class PrintTree {
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
        printTree(root);
    }
    // PreOrder
    public static void printTree(TreeNode<Integer> root) {
        if(root==null){ // Not a base case but an edge case when root is null
            return;
        }
        System.out.print(root.data + " "); // print current node's data
        for(TreeNode<Integer> treeNode : root.children){
            printTree(treeNode); // recursively call the function for children
        }
//        for(int i = 0; i < root.children.size();i++){
//            TreeNode<Integer> child = root.children.get(i);
//            printTree(child);
//        }
    }
}
