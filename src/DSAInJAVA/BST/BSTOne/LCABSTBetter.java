package DSAInJAVA.BST.BSTOne;

public class LCABSTBetter {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLRR = new BinaryTreeNode<>(7);
        root.left = rootL;
        root.right = rootR;
        rootL.left = rootLL;
        rootL.right = rootLR;
        rootLR.right = rootLRR;
        int a = 2;
        int b = 6;
        System.out.println(getLCA(root, a, b));
    }
    private static int getLCA(BinaryTreeNode<Integer> root,int a, int b){
        BinaryTreeNode<Integer> node = getLCAHelper(root,a,b);
        return node == null ? -1 : node.data;
    }
    private static BinaryTreeNode<Integer> getLCAHelper(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null || root.data==a||root.data==b){ // v.v.v important line
            return root;
        }
        if(root.data>a && root.data>b){
            return getLCAHelper(root.left,a,b);
        } else if (root.data<a && root.data<b) {
            return getLCAHelper(root.right,a,b);
        }
        BinaryTreeNode<Integer> leftLCA = getLCAHelper(root.left,a,b);
        BinaryTreeNode<Integer> rightLCA = getLCAHelper(root.right,a,b);
        if ((leftLCA!=null && rightLCA!=null)){
            return root;
        } else if (rightLCA==null) {
            return leftLCA;
        }
        else {
            return rightLCA;
        }
    }
}
