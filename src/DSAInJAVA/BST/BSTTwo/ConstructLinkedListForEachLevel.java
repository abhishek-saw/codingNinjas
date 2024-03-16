package DSAInJAVA.BST.BSTTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructLinkedListForEachLevel {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(14);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> rootRL = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootR.left = rootRL;
        rootR.right = rootRR;
        ArrayList<LinkedListNode<Integer>> answer = constructLinkedListForEachLevel(root);
        for (LinkedListNode<Integer> integerBinaryTreeNode : answer){
            printLLRecursively(integerBinaryTreeNode);
            System.out.println();
        }
    }
    private static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        ArrayList<LinkedListNode<Integer>> answer = new ArrayList<>();
        return constructLinkedListForEachLevelHelper(root,answer);
    }
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevelHelper
            (BinaryTreeNode<Integer> root, ArrayList<LinkedListNode<Integer>> answer) {
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode<Integer>> pendingQueues = new LinkedList<>();
        pendingQueues.add(root);
        BinaryTreeNode<Integer> nullNode = new BinaryTreeNode<>(0);
        pendingQueues.add(nullNode);
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail  = null;
        while (!pendingQueues.isEmpty()) {
            BinaryTreeNode<Integer> node = pendingQueues.poll();
            if (node != nullNode) {
                if (head == null) {
                    head = new LinkedListNode<>(node.data);
                    tail = head;
                } else {
                    tail.next = new LinkedListNode<>(node.data);
                    tail = tail.next;
                }
            }
            if (node.left != null) {
                pendingQueues.add(node.left);
            }
            if (node.right != null) {
                pendingQueues.add(node.right);
            }
            if (pendingQueues.peek() == nullNode) {
                answer.add(head);
                head = null;
                tail = null;
                pendingQueues.poll();
                pendingQueues.add(nullNode);
            }
        }
        return answer;
    }
    private static void printLLRecursively(LinkedListNode<Integer> integerBinaryTreeNode) {
        if (integerBinaryTreeNode==null){
            return;
        }
        System.out.print(integerBinaryTreeNode.data + " ");
        printLLRecursively(integerBinaryTreeNode.next);
    }
}
