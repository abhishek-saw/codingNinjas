package DSAInJAVA.Trees;

public class MaxSumNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(40);
        TreeNode<Integer> node4 = new TreeNode<>(150);
        TreeNode<Integer> node5 = new TreeNode<>(50);
        TreeNode<Integer> node6 = new TreeNode<>(6);
        TreeNode<Integer> node7 = new TreeNode<>(100);
        TreeNode<Integer> node8 = new TreeNode<>(10000);
        TreeNode<Integer> node9 = new TreeNode<>(80);
        TreeNode<Integer> node10 = new TreeNode<>(83);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node3.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);
        node3.children.add(node7);
        node5.children.add(node8);
        node6.children.add(node9);
        node7.children.add(node10);
        PrintTreeBest.printTree(root);
        System.out.println(maxSumNode(root).data);
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        TreeNode<Integer> maxNode = root;
        int sum = 0;  //Base Case
        sum +=root.data; // adding root and its children
        for (TreeNode<Integer> child : root.children){
            sum +=child.data;
        }
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> newMax = maxSumNode(root.children.get(i));
            int count  = newMax.data;
            for (TreeNode<Integer> childNode : newMax.children) {
                count += childNode.data;
            }
            if (count > sum) {
                sum = count;
                maxNode = newMax;
            }
        }
        System.out.println("RootData : " + root.data + " max Data " + maxNode.data +  " max sum " + sum);
        return maxNode;
    }
}
