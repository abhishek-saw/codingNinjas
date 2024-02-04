package IntorductionToJAVA.ArrayTwo;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class RotateArrayInPlace {
    private static void reverseArray(int[] a,int start, int end) {
        int length = (end - start)/2;
        for(int i = 0;i<length;i++){
            int temp = a[start+i];
            a[start+i] = a[end-i-1];
            a[end-i-1] = temp;
        }
    }
    private static void rotateArrayLeft(int[] a, int x) {
        reverseArray(a,0,a.length);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        reverseArray(a,0,a.length-x);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        System.out.println();
        reverseArray(a,a.length-x,a.length);
    }
    private static void rotateArrayRight(int[] a, int x) {
        reverseArray(a,0,a.length);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        reverseArray(a,0,x);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        System.out.println();
        reverseArray(a,x,a.length);
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        x = x%a.length;
        if(x>0 && dir.equals("RIGHT")){
            rotateArrayRight(a,x);
        }
        else if(x>0 && dir.equals("LEFT")) {
            rotateArrayLeft(a,x);
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int x1 = 1;
        String dir1 = "LEFT";
        int[] answer1 = rotateArray(arr1,x1,dir1);
        TakeInputAndPrint.printArray(answer1);
        System.out.println();

        int[] arr2 = {1,2,3,4,5};
        int x2 = 1;
        String dir2 = "RIGHT";
        int[] answer2 = rotateArray(arr2,x2,dir2);
        TakeInputAndPrint.printArray(answer2);
    }
}
