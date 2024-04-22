package Revision.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BinarySearchTreeOne {
    public static class LinkedListNode<T> {
        T data;
        LinkedListNode<Integer> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

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
        System.out.println("SearchInBST");
        printBinaryTreeRecursivelyPreOrder(root);
        System.out.println();
        System.out.println(searchInBST(root, 2));
        System.out.println(searchInBST(root, 13));
        System.out.println("PrintElementsInRangeK1K2");
        printBinaryTreeRecursivelyPreOrder(root);
        System.out.println();
        System.out.print("InRangeK1K2: ");
        elementsInRangeK1K2(root, 6, 10);
        System.out.println();
        System.out.println("IsBST");
        printBinaryTreeRecursivelyPreOrder(root);
        System.out.println();
        System.out.println(isBST(root));
        System.out.println(isBSTOk(root));
        System.out.println("sortedArrayToBST");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        BinaryTreeNode<Integer> rootArray = sortedArrayToBST(arr, arr.length);
        printBinaryTreeRecursivelyPreOrder(rootArray);
        System.out.println();
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL1 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR1 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR1 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLRR1 = new BinaryTreeNode<>(7);
        root1.left = rootL1;
        root1.right = rootR1;
        rootL1.left = rootLL1;
        rootL1.right = rootLR1;
        rootLR1.right = rootLRR1;
        System.out.println("constructLinkedListBST");
        System.out.println("BINARY TREE");
        printBinaryTreeRecursivelyPreOrder(root1);
        System.out.println();
        System.out.println("LINKED LIST");
        LinkedListNode<Integer> head = constructLinkedListBST(root1);
        printLinkedList(head);
        System.out.println();
        System.out.println("getLCA");
        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> rootL2 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> rootR2 = new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer> rootLL2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootLR2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> rootLRR2 = new BinaryTreeNode<>(7);
        root2.left = rootL2;
        root2.right = rootR2;
        rootL2.left = rootLL2;
        rootL2.right = rootLR2;
        rootLR2.right = rootLRR2;
        int a = 2;
        int b = 6;
        System.out.println(getLCA(root2, a, b));
        System.out.println(getLCABetter(root2, a, b));
        System.out.println("ReplaceWithLargerNodesSum");
        printBinaryTreeRecursivelyPreOrder(root2);
        System.out.println();
        replaceWithLargerNodesSum(root2);
        printBinaryTreeRecursivelyPreOrder(root2);
    }
    private static int getLCABetter(BinaryTreeNode<Integer> root, int a, int b){
        BinaryTreeNode<Integer> answer =  getLCABetterHelper(root,a,b);
        return answer==null ? -1: answer.data;
    }

    private static BinaryTreeNode<Integer> getLCABetterHelper(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null ||root.data==a ||root.data==b ){
            return root;
        }
        if(root.data<a && root.data<b){
            return getLCABetterHelper(root.right,a,b);
        }
        else if(root.data>a && root.data>b){
            return getLCABetterHelper(root.left,a,b);
        }
        else {
            BinaryTreeNode<Integer> leftLCA = getLCABetterHelper(root.left,a,b);
            BinaryTreeNode<Integer> rightLCA = getLCABetterHelper(root.right,a,b);
            if(leftLCA!=null && rightLCA!=null) {
                return root;
            }
            else if(leftLCA==null){
                return rightLCA;
            }
            else {
                return leftLCA;
            }
        }
    }

    private static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null) {
            return -1;
        }
        ArrayList<Integer> path1 = getPath(root, a);
        ArrayList<Integer> path2 = getPath(root, b);
        if (path1 != null && path2 != null) {
            return findData(path1,path1.size(),path2,path2.size());
        }
        return -1;
    }
    private static int findData(ArrayList<Integer> path1, int m, ArrayList<Integer> path2, int n) {
        for(int i =0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                if(Objects.equals(path1.get(i), path2.get(j))){
                    return path1.get(i);
                }
            }
        }
        return -1;
    }
    private static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        } else if (root.data > data) {
            ArrayList<Integer> leftOutput = getPath(root.left, data);
            if (leftOutput != null) {
                leftOutput.add(root.data);
            }
            return leftOutput;
        } else {
            ArrayList<Integer> rightOutput = getPath(root.right, data);
            if (rightOutput != null) {
                rightOutput.add(root.data);
            }
            return rightOutput;
        }
    }
    private static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        replaceWithLargerNodesSumHelper(root, 0);
    }
    private static int replaceWithLargerNodesSumHelper(BinaryTreeNode<Integer> root, int sum) {
        if (root == null) {
            return sum;
        }
        sum = replaceWithLargerNodesSumHelper(root.right, sum);
        sum += root.data;
        root.data = sum;
        sum = replaceWithLargerNodesSumHelper(root.left, sum);
        return sum;
    }
    private static LinkedListNode<Integer> constructLinkedListBST(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }
        LinkedListNode<Integer> temp = new LinkedListNode<>(root.data);
        constructLinkedListBSTHelper(root,temp);
        return temp.next;
    }
    private static LinkedListNode<Integer> constructLinkedListBSTHelper(BinaryTreeNode<Integer> root, LinkedListNode<Integer> temp) {
        if(root==null){
            return temp;
        }
        if(root.left!=null) {
            temp = constructLinkedListBSTHelper(root.left, temp);
        }
        LinkedListNode<Integer> newData = new LinkedListNode<>(root.data);
        temp.next = newData;
        temp = newData;
        if(root.right!=null) {
            temp = constructLinkedListBSTHelper(root.right, temp);
        }
        return temp;
    }
    private static void printLinkedList(LinkedListNode<Integer> head) {
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
    private static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int length) {
        return sortedArrayToBSTHelper(arr,0,length-1);
    }
    private static BinaryTreeNode<Integer> sortedArrayToBSTHelper(int[] arr, int start, int end) {
        if(start>end){
            return null;
        }
        int rootPos = start + (end-start)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[rootPos]);
        root.left = sortedArrayToBSTHelper(arr,start,rootPos-1);
        root.right = sortedArrayToBSTHelper(arr,rootPos+1,end);
        return root;
    }
    private static void printBinaryTreeRecursivelyPreOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        printBinaryTreeRecursivelyPreOrder(root.left);
        printBinaryTreeRecursivelyPreOrder(root.right);
    }
    public static boolean isBSTOk(BinaryTreeNode<Integer> root) {
        return isBSTOkHelper(root).isBST;
    }
    private static IsBSTReturn isBSTOkHelper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
        }
        IsBSTReturn leftOutput = isBSTOkHelper(root.left);
        IsBSTReturn rightOutput = isBSTOkHelper(root.right);
        int min = Math.min(root.data,Math.min(leftOutput.min,rightOutput.min));
        int max = Math.max(root.data,Math.max(leftOutput.max,rightOutput.max));
        boolean isBST = true;
        if(root.data<= leftOutput.max){
            isBST = false;
        }
        if(root.data> rightOutput.min){
            isBST = false;
        }
        if(!leftOutput.isBST){
            isBST = false;
        }
        if(!rightOutput.isBST){
            isBST = false;
        }
        return new IsBSTReturn(min,max,isBST);
    }
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBSTHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean isBSTHelper(BinaryTreeNode<Integer> root, long minValue, long maxValue) {
        if(root==null){
            return true;
        }
        if(root.data<minValue){
            return false;
        }
        if(root.data>maxValue){
            return false;
        }
        return isBSTHelper(root.left,minValue,root.data) && isBSTHelper(root.right,root.data,maxValue);
    }
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data<k1){
            elementsInRangeK1K2(root.right,k1,k2);
        }
        else if(root.data>k2){
            elementsInRangeK1K2(root.left,k1,k2);
        }
        else {
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right,k1,k2);
        }
    }
    private static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        } else if (root.data>k) {
            return searchInBST(root.left,k);
        }
        else {
            return searchInBST(root.right,k);
        }
    }
}
