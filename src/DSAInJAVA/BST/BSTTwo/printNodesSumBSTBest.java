package DSAInJAVA.BST.BSTTwo;

import java.util.Stack;

public class printNodesSumBSTBest {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLLR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLLR;
        printNodesSumToS(root, 12);
    }

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        // TIME COMPLEXITY : O(N*logN)
        // SPACE COMPLEXITY : O(logN)
        if (root == null) {
            return;
        }
        int countNodes = countNodes(root);
        Stack<BinaryTreeNode<Integer>> stackIn = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stackInRev = new Stack<>();
        BinaryTreeNode<Integer> temp =root;
        while(temp!=null){
            stackIn.add(temp);
            temp = temp.left;
        }
        temp = root;
        while(temp!=null){
            stackInRev.add(temp);
            temp = temp.right;
        }
        int runningCount =0;
        while(runningCount<countNodes-1){
            BinaryTreeNode<Integer> top1 = stackIn.peek();
            BinaryTreeNode<Integer> top2 = stackInRev.peek();
            if(top1.data+top2.data==s){
                System.out.println(top1.data + " " + top2.data);
                BinaryTreeNode<Integer> top = top1;
                stackIn.pop();
                runningCount++;
                if(top.right!=null){
                    top = top.right;
                    while(top!=null){
                        stackIn.push(top);
                        top = top.left;
                    }
                }
                top=top2;
                stackInRev.pop();
                runningCount++;
                if(top.left!=null){
                    top = top.left;
                    while(top!=null){
                        stackInRev.push(top);
                        top = top.right;
                    }
                }
            }
            else if(top1.data+top2.data<s){
                BinaryTreeNode<Integer> top = top1;
                stackIn.pop();
                runningCount++;
                if(top.right!=null){
                    top = top.right;
                    while(top!=null){
                        stackIn.push(top);
                        top = top.left;
                    }
                }
            }
            else {
                BinaryTreeNode<Integer> top = top2;
                stackInRev.pop();
                runningCount++;
                if(top.left!=null){
                    top = top.left;
                    while(top!=null){
                        stackInRev.push(top);
                        top = top.right;
                    }
                }

            }
        }
    }

    private static int countNodes(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}