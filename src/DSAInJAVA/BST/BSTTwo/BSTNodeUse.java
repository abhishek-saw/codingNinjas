package DSAInJAVA.BST.BSTTwo;

public class BSTNodeUse {
    public static void main(String[] args) {
//        1. AVL TREES : if left height 4 and right height 6 : then rotate the tree right to left
//        2. Red Black Trees
        BSTNode bst = new BSTNode();
        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);
        bst.insert(8);
        bst.printTree();
        System.out.println("Size: " + bst.size());
        System.out.println("------Delete 5--------");
        System.out.println(bst.isPresent(5));
        System.out.println(bst.deleteData(5));
        System.out.println(bst.isPresent(5));
        bst.printTree();
        System.out.println("Size: " + bst.size());
        System.out.println("------Delete 2--------");
        System.out.println(bst.isPresent(2));
        System.out.println(bst.deleteData(2));
        System.out.println(bst.isPresent(2));
        bst.printTree();
        System.out.println("Size: " + bst.size());
    }
}
