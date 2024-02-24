package DSAInJAVA.BinaryTree.BinaryTreeTwo;

public class BinaryTreeNode<T> {
    // data structure
    public T data;
    public BinaryTreeNode<T> left ;
    public BinaryTreeNode<T> right ;
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
