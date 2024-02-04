package Revision.Arrays;

import static Revision.Arrays.ArrayOne.printArray;

public class ArrayTwo {
    public static void main(String[] args) {
        System.out.println("pushZeroToEnd");
        int[] pushZero = {2, 0, 0, 1, 3, 0, 0};
        printArray(pushZero);
        pushZeroToEnd(pushZero);
        printArray(pushZero);

        System.out.println("separateNegativeAndPositive");
        int[] negativeArr = {1, 2, -3, 4, -4, -5};
        int[] ans1 = separateNegativeAndPositive(negativeArr);
        printArray(ans1);

        System.out.println("rotateArrayCopy");
        int [] a2 = {1,2,3,4};
        int x2 = 1;
        String dir = "LEFT";
        printArray(a2);
        int [] ans = rotateArrayCopy(a2,x2,dir);
        printArray(ans);


        int[] a1 = {22,8,4,7,5};
        int x1 = 3;
        String dir2 = "LEFT";
        printArray(a1);
        int [] ans2 = rotateArrayCopy(a1,x1,dir2);
        printArray(ans2);

        int[] a3 = {1,2,4,3,5,6};
        int x3 = 2;
        String dir1 = "RIGHT";
        printArray(a3);
        int [] ans3 = rotateArrayCopy(a3,x3,dir1);
        printArray(ans3);

        System.out.println("rotateArray");
        int[] b1 = {22,8,4,7,5};
        int y1 = 3;
        String dir3 = "RIGHT";
        printArray(b1);
        rotateArray(b1,y1,dir3);
        printArray(b1);

        int[] b2 = {22,8,4,7,5};
        int y2 = 1;
        String dir4 = "LEFT";
        printArray(b2);
        rotateArray(b2,y2,dir4);
        printArray(b2);

        System.out.println("checkArrayRotation");
        int [] checkArrayR =  {5,6,1,2,3,4};
        System.out.println(checkArrayRotation(checkArrayR));

        System.out.println("reverseBetween");
        int [] reverseBet = {21,6,46,36,10};
        printArray(reverseBet);
        reverseBetween(reverseBet.length,0,3,reverseBet);
        printArray(reverseBet);

        System.out.println("sumOfTwoArrays");
        int [] x = {9,7,6,1};
        int [] y = {4,5,9};
        int [] output = new int[Math.max(x.length,y.length)+1];
        sumOfTwoArrays(x,y,output);
        printArray(output);

        System.out.println("extraCandies");
        int n = 3;
        int x4 = 6;
        int [] p1 = {2,6,1};
        int [] p2 = {1,2,1};
        int [] candies = extraCandies(n,x4,p1,p2);
        printArray(candies);

        System.out.println("secondLargestElement");
        int [] arrSecondLargest = {4,3,10,9,2};
        System.out.println(secondLargestElement(arrSecondLargest));
    }
    public static int secondLargestElement(int [] arr){
        int largest = Integer.MIN_VALUE;
        int ndLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > ndLargest) {
                if (j > largest) {
                    ndLargest = largest;
                    largest = j;
                } else {
                    ndLargest = j;
                }
            }
        }
        return ndLargest;
    }
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        int numbs =0;
        int [] candy = new int[n];
        for(int i=0;i<n;i++){
            numbs += p1[i] + p2[i];
            if(numbs>=x){
                candy[i] = x;
                numbs = numbs - x;
            }
            else {
                candy[i] = numbs;
                numbs =0;
            }
        }
        return candy;
    }
    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int m = arr1.length-1;
        int n = arr2.length-1;
        int index = 0;
        int sum = 0;
        while(index<=m && index<=n){
            sum+= arr1[m-index]+arr2[n-index];
            output[output.length-index-1] = sum%10;
            sum = sum/10;
            index++;
        }
        while(index<=m ){
            sum+= arr1[m-index];
            output[output.length-index-1] = sum%10;
            sum = sum/10;
            index++;
        }
        while(index<=n){
            sum+=arr2[n-index];
            output[output.length-index-1] = sum%10;
            sum = sum/10;
            index++;
        }
        output[output.length-index-1] = sum;
    }
    public static void reverseBetween(int n, int l, int r, int []arr) {
        int len = (r-l)/2;
        for(int i = 0;i<=len;i++){
            int temp = arr[i+l];
            arr[i+l] = arr[r-i];
            arr[r-i] = temp;
        }
    }
    public static int checkArrayRotation(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }
    public static void rotateArray(int []a, int x, String dir) {
        x=x%a.length;
        if(dir.equals("RIGHT")) {
            rotateArrayRight(a, x);
        }
        else {
            rotateArrayLeft(a, x);
        }
    }
    private static void rotateArrayLeft(int[] a, int x) {
        reverseArray(a, 0, a.length );
        reverseArray(a, 0, a.length- x);
        reverseArray(a, a.length- x, a.length );
    }
    private static void rotateArrayRight(int[] a, int x) {
        reverseArray(a, 0, a.length );
        reverseArray(a, 0, x);
        reverseArray(a, x, a.length );
    }
    private static void reverseArray(int[] a, int s, int e) {
        for(int i = 0;i<(e-s)/2;i++){
            int temp = a[s+i];
            a[s+i] = a[e-i-1];
            a[e-i-1] = temp;
        }
    }
    public static int[] rotateArrayCopy(int []a, int x, String dir) {
        x = x%a.length;
        int[] copyArr = new int[a.length];
        if (dir.equals("LEFT")) {
            for (int i = 0; i < a.length; i++) {
                if(i<a.length-x) {
                    copyArr[i] = a[i + x];
                }
                else {
                    copyArr[i] = a[i+x-a.length];
                }
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                if(i<x) {
                    copyArr[i] = a[a.length- x + i];
                }
                else {
                    copyArr[i] = a[i-x];
                }
            }
        }
        return copyArr;
    }
    public static int[] separateNegativeAndPositive(int[] negativeArr) {
        int index =0;
        for(int i =0;i<negativeArr.length;i++){
            if(negativeArr[i]<0){
                int temp = negativeArr[i];
                negativeArr[i] = negativeArr[index];
                negativeArr[index] = temp;
                index++;
            }
        }
        return negativeArr;
    }
    public static void pushZeroToEnd(int[] pushZero) {
        int i = 0 ;
        int j = 0 ;
        while (j<pushZero.length-1){
            if(pushZero[j]!=0){
                int temp = pushZero[i];
                pushZero[i] = pushZero[j];
                pushZero[j] = temp;
                i++;
            }
            j++;
        }
    }
}
