package DSAInJAVA.BST.BSTOne;

public class BinaryTreeNode<T> {
    // data structure
    public T data;
    public BinaryTreeNode<Integer> left ;
    public BinaryTreeNode<Integer> right ;
    //constructors
    public BinaryTreeNode(){
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(T data){
        this.data = data;
    }
}
