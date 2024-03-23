package DSAInJAVA.Trees;

public class MaxSumNodeBetter {
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
       return maxSumNodeHelper(root).maxNode;
    }
    private static PairMax maxSumNodeHelper(TreeNode<Integer> root) {
        if(root==null){
            return new PairMax(null,0);
        }
        int sum = root.data;
        for(TreeNode<Integer> child: root.children){
            sum+=child.data;
        }
        PairMax answer = new PairMax(root,sum);
        for(TreeNode<Integer> child: root.children){
            PairMax newMax = maxSumNodeHelper(child);
            if(answer.maxValue<newMax.maxValue){
                answer = newMax;
            }
        }
        System.out.println("RootData : " + root.data + " max Data " + answer.maxValue +  " max sum " + sum);
        return answer;
    }
}
