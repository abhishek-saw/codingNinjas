package DSAInJAVA.BST.BSTTwo;

public class BSTNodeUse2 {
    public static void main(String[] args) {
//        1. AVL TREES : if left height 4 and right height 6 : then rotate the tree right to left
//        2. Red Black Trees
        BSTNode2 bst = new BSTNode2();
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
        bst.deleteData(5);
        System.out.println(bst.isPresent(5));
        bst.printTree();
        System.out.println("Size: " + bst.size());
        System.out.println("------Delete 2--------");
        System.out.println(bst.isPresent(2));
        bst.deleteData(2);
        System.out.println(bst.isPresent(2));
        bst.printTree();
        System.out.println("Size: " + bst.size());
    }
}
