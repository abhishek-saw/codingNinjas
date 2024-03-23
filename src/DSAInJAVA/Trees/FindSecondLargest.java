package DSAInJAVA.Trees;

public class FindSecondLargest {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(5);
        TreeNode<Integer> node3 = new TreeNode<>(1);
        TreeNode<Integer> node4 = new TreeNode<>(6);
        TreeNode<Integer> node5 = new TreeNode<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        PrintTree.printTree(root);
        System.out.println();
        System.out.println(findSecondLargest(root).data);
    }
    private static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
        return findSecondLargestHelper(root).secondMax;
    }

    private static PairSecondLargest findSecondLargestHelper(TreeNode<Integer> root) {
        if(root==null){
            return new PairSecondLargest(new TreeNode<>(Integer.MIN_VALUE),new TreeNode<>(Integer.MIN_VALUE));
        }
        PairSecondLargest answer = new PairSecondLargest(root,new TreeNode<>(Integer.MIN_VALUE));
        for(TreeNode<Integer> child : root.children){
            PairSecondLargest smallerOutput = findSecondLargestHelper(child);
            TreeNode<Integer> temp = new TreeNode<>(Integer.MIN_VALUE);
            if (smallerOutput.max.data > answer.max.data) { //finding the second min
                temp = answer.max;
                answer.max = smallerOutput.max;
            } else if(!smallerOutput.max.data.equals(answer.max.data)) { //to check max of child and answer not equal
                temp = smallerOutput.max;
            }
            if (temp.data > answer.secondMax.data) { //reassigning
                answer.secondMax = temp;
            }
            if (smallerOutput.secondMax.data > answer.secondMax.data) { // checking for second max
                answer.secondMax = smallerOutput.secondMax;
            }
        }
        return answer;
    }
}
