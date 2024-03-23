package DSAInJAVA.Trees;

import java.util.Objects;

public class CheckIdentical {
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
        PrintTree.printTree(root);
        System.out.println();
        TreeNode<Integer> roots= new TreeNode<>(4);
        TreeNode<Integer> node1x = new TreeNode<>(2);
        TreeNode<Integer> node2x = new TreeNode<>(3);
        TreeNode<Integer> node3x = new TreeNode<>(1);
        TreeNode<Integer> node4x = new TreeNode<>(5);
        TreeNode<Integer> node5x = new TreeNode<>(6);
        roots.children.add(node1x);
        roots.children.add(node2x);
        roots.children.add(node3x);
        node2x.children.add(node4x);
        node2x.children.add(node5x);
        PrintTree.printTree(roots);
        System.out.println();
        System.out.println(checkIdentical(root,roots));
    }

    private static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        boolean isIdentical = true;
        return checkIdenticalHelper(root1,root2,isIdentical);
    }
    private static boolean checkIdenticalHelper(TreeNode<Integer> root1, TreeNode<Integer> root2, boolean isIdentical) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        int len1 = 0;
        int len2 = 0;
        for(TreeNode<Integer> ignored : root1.children){
            len1++;
        }
        for(TreeNode<Integer> ignored : root2.children){
            len2++;
        }
        if(!Objects.equals(root1.data, root2.data)){
            return false;
        }
        if(len1!=len2){
            return false;
        }
        for(int i = 0;i<len1;i++){
            isIdentical = checkIdenticalHelper(root1.children.get(i),root2.children.get(i),isIdentical);
        }
        return isIdentical;
    }
}
