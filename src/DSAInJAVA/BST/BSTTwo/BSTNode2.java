package DSAInJAVA.BST.BSTTwo;

public class BSTNode2 {
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


    public void deleteData(int data){
        // Time Complexity : O(height of tree)
        // 1. LEAF -> O(h)
        // 2. ONE CHILD -> O(h)
        // 3. TWO CHILDREN
        // a. Find the node with min data -> k
        // b. Find minimum of  right side -> h-k
        // c. Delete min from right side -> h-k
        this.root = deleteDataHelper(this.root,data);
    }
    private static BinaryTreeNode<Integer> deleteDataHelper(BinaryTreeNode<Integer> node, int data) {
        if(node==null){
            return null;
        }
        if(node.data>data){
            node.left = deleteDataHelper(node.left,data);
            return node;
        } else if (node.data<data) {
            node.right = deleteDataHelper(node.right,data);
            return node;
        }
        else {
            if(node.left==null && node.right==null){
                return null;
            } else if (node.left==null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            else{
                // to calculate the minimum on the right side
                BinaryTreeNode<Integer> minNode = node.right;while(minNode.left!=null){
                    minNode = minNode.left;
                }
                node.data = minNode.data;
                node.right = deleteDataHelper(node.right,minNode.data);
                return node;
            }
        }
    }
}
