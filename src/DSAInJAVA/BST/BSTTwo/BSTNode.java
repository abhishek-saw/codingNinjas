package DSAInJAVA.BST.BSTTwo;

public class BSTNode {
    //structures
    private BinaryTreeNode<Integer> root;
    private int size;

    //methods : size, isPresent, printTree, insert, deleteData
    public int size(){
        return size;
    }

    public boolean isPresent(int data){
        // Time Complexity : O(height of tree)
        return isPresentHelper(this.root,data);
    }
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int data) {
        if (node==null){
            return false;
        }
        if(node.data==data){
            return true;
        }
        if(node.data>data){
            return isPresentHelper(node.left,data);
        }
        else{
            return isPresentHelper(node.right,data);
        }
    }


    public void printTree(){
        printTreeHelper(this.root);
    }
    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
        if(node==null){
            return;
        }
        System.out.print(node.data + " : ");
        if(node.left!=null){
            System.out.print("L:" + node.left.data+",");
        }
        if(node.right!=null){
            System.out.print("R:" + node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }


    public void insert(int data){
        // Time Complexity : O(height of tree)
        this.root = insertHelper(this.root,data);
        size++;
    }
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int data) {
        if(node==null){
            BinaryTreeNode<Integer> newNode;
            newNode = new BinaryTreeNode<>(data);
            return newNode;
        }
        if(node.data<data){
            node.right = insertHelper(node.right,data);
        }
        else{
            node.left = insertHelper(node.left,data);
        }
        return node;
    }


    public boolean deleteData(int data){
        // Time Complexity : O(height of tree)
        // 1. LEAF -> O(h)
        // 2. ONE CHILD -> O(h)
        // 3. TWO CHILDREN
        // a. Find the node with min data -> k
        // b. Find minimum of  right side -> h-k
        // c. Delete min from right side -> h-k
        BSTDeleteReturn output = deleteDataHelper(this.root,data);
        root = output.root;
        if(output.deleted) {
            size--;
        }
        return output.deleted;
    }
    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> node, int data) {
        if(node==null){
            return new BSTDeleteReturn(null,false);
        }
        if(node.data<data){
            BSTDeleteReturn outputRight = deleteDataHelper(node.right,data);
            node.right = outputRight.root;
            outputRight.root = node;
            return outputRight;
        }
        if(node.data>data){
            BSTDeleteReturn outputLeft = deleteDataHelper(node.left,data);
            node.left = outputLeft.root;
            outputLeft.root = node;
            return outputLeft;
        }
        // no children
        if(node.left==null && node.right==null){
            return new BSTDeleteReturn(null,true);
        }
        // only right child
        if(node.left == null){
            return new BSTDeleteReturn(node.right,true);
        }
        // only left child
        if(node.right == null){
            return new BSTDeleteReturn(node.left,true);
        }
        //2 children
        int rightMin = findMinimum(node.right);
        node.data = rightMin;
        BSTDeleteReturn outputRight = deleteDataHelper(node.right,rightMin);
        node.right = outputRight.root;
        outputRight.root = node;
        return new BSTDeleteReturn(node,true);
    }
    private static int findMinimum(BinaryTreeNode<Integer> node) {
        if(node==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(node.data,Math.min(findMinimum(node.left),findMinimum(node.right)));
    }

}
