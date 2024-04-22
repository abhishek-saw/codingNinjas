package Revision.BinarySearchTree;

public class BinaryTreeNode<T> {
     T data;
     BinaryTreeNode<Integer> left ;
     BinaryTreeNode<Integer> right ;
    public BinaryTreeNode(){
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public BinaryTreeNode(T data){
        this.data = data;
    }
}
