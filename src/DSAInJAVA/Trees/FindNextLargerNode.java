package DSAInJAVA.Trees;

public class FindNextLargerNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(30);
        TreeNode<Integer> node3 = new TreeNode<>(40);
        TreeNode<Integer> node4 = new TreeNode<>(40);
        TreeNode<Integer> node5 = new TreeNode<>(50);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node1.children.add(node5);
        PrintTreeBest.printTree(root);
        System.out.println(findNextLargerNode(root, 48)!=null ?
                findNextLargerNode(root, 40).data : Integer.MIN_VALUE);
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
        if (root == null) {
            return null;
        }
        TreeNode<Integer> answer = null;
        if (root.data > n) {
            answer = root;
        }
        for (TreeNode<Integer> child : root.children) {
            TreeNode<Integer> smallOutput = findNextLargerNode(child, n);
            if(smallOutput!=null) {
                if (answer != null) {
                    if (smallOutput.data > n && answer.data > smallOutput.data) {
                        answer = smallOutput;
                    }
                } else {
                    if (smallOutput.data >= n) {
                        answer = smallOutput;
                    }
                }
            }
        }
        return answer;
    }
}