package DSAInJAVA.Trees;

public class PrintTreeAtLevelK {
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
        printTree(root,2);
    }
    public static void printTree(TreeNode<Integer> root,int k) {
        if (root==null){return;}
        if(k==0){
            System.out.println(root.data);
        }
        for (TreeNode<Integer> child :root.children){
            printTree(child,k-1);
        }
    }
}