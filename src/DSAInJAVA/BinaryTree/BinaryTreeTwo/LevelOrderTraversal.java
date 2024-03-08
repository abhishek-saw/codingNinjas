package DSAInJAVA.BinaryTree.BinaryTreeTwo;



import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(20);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(50);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(60);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.right = rootLLR;
        BinaryTreePrintLevelWise.binaryTreePrintLevelWise(root);
        System.out.println();
        levelOrderTraversal(root);
        System.out.println();
        levelOrderTraversalBetter(root);
    }
    private static void levelOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> integerQueue = new LinkedList<>();
        BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<>(0);
        integerQueue.add(root);
        integerQueue.add(nullNode);
        while (!integerQueue.isEmpty()) {
            BinaryTreeNode<Integer> node = integerQueue.poll();
            if (node != nullNode) {
                System.out.print(node.data + " ");
            }
            if (node.left != null) {
                integerQueue.add(node.left);
            }
            if (node.right != null) {
                integerQueue.add(node.right);
            }
            if (integerQueue.peek() == nullNode) {
                System.out.println();
                integerQueue.poll();
                integerQueue.add(nullNode);
            }
        }
    }
    private static void levelOrderTraversalBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> integerQueue = new LinkedList<>();
        integerQueue.add(root);
        integerQueue.add(null);
        while (!integerQueue.isEmpty()) {
            BinaryTreeNode<Integer> node = integerQueue.poll();
            if (node == null) {
                System.out.println();
                if (!integerQueue.isEmpty()) {
                    integerQueue.add(null);
                }
            } else {
                System.out.print(node.data + " ");
                if (node.left != null) {
                    integerQueue.add(node.left);
                }
                if (node.right != null) {
                    integerQueue.add(node.right);
                }
            }
        }
    }
}
