package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class PrintNodesAtDistanceK {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rootLRR = new BinaryTreeNode<>(9);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLRR;
        int node = 3;
        int k = 1;
        nodesAtDistanceK(root, node, k);
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        nodesAtDistanceKHelper(root, node, k);
    }
    private static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int node, int k) {
        if(root==null){
            return -1;
        }
        if(root.data == node){
            nodesAtDistanceKDown(root,k);
            return 0;
        }
        int leftDistance = nodesAtDistanceKHelper(root.left,node,k);
        if(leftDistance!=-1) {
            if (leftDistance + 1 == k) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.right, k - leftDistance - 2);
            }
            return leftDistance + 1;
        }
        int rightDistance = nodesAtDistanceKHelper(root.right,node,k);
        if(rightDistance!=-1) {
            if (rightDistance + 1 == k) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.left, k - rightDistance - 2);
            }
            return rightDistance + 1;
        }
        return -1;
    }

    private static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        nodesAtDistanceKDown(root.left,k-1);
        nodesAtDistanceKDown(root.right,k-1);
    }
}
