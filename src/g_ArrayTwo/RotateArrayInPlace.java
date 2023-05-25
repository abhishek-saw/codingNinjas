package g_ArrayTwo;

import e_ArrayOne.TakeInputAndPrint;

public class RotateArrayInPlace {
    private static void reverseArray(int[] a,int start, int end) {
        int length = end - start;
        for(int i = 0;i<length/2;i++){
            int temp = a[start+i];
            a[start+i] = a[end-i-1];
            a[end-i-1] = temp;
        }
    }
    private static void rotateArrayLeft(int[] a, int x, String dir) {
        int rot = x%a.length;
        reverseArray(a,0,a.length);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        reverseArray(a,0,a.length-rot);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        System.out.println();
        reverseArray(a,a.length-rot,a.length);
    }
    private static void rotateArrayRight(int[] a, int x, String dir) {
        int rot = x%a.length;
        reverseArray(a,0,a.length);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        reverseArray(a,0,rot);
        System.out.println();
        TakeInputAndPrint.printArray(a);
        System.out.println();
        reverseArray(a,rot,a.length);
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        if(dir.equals("RIGHT")){
            rotateArrayRight(a,x,dir);
        }
        else{
            rotateArrayLeft(a,x,dir);
        }
        return a;
    }
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6};
        int x1 = 2;
        String dir1 = "LEFT";
        int answer1[] = rotateArray(arr1,x1,dir1);
        TakeInputAndPrint.printArray(answer1);
        System.out.println();

        int arr2 [] = {1,2,4,3,5,6};
        int x2 = 2;
        String dir2 = "RIGHT";
        int answer2[] = rotateArray(arr2,x2,dir2);
        TakeInputAndPrint.printArray(answer2);
    }
}
