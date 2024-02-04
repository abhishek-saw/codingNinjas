package Revision.Arrays;

import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[3] = 711;
        arr[8] = 171;
        System.out.println(arr[3]);
        System.out.println(arr[5]);
        char[] c = new char[5];
        double[] d = new double[5];
        c[0] = 'a';
        d[0] = 3.3;
        System.out.println(c[0]);
        System.out.println(d[0]);

        int[] swapArray = {1, 2, 3, 4, 5};
        swapAlternative(swapArray);
        printArray(swapArray);
        System.out.println();

        int[] pairsArr = {1, 2, 3, 4, 5};
        printAllPairs(pairsArr);

        int n1 = 6;
        int [] arrArrange = new int[n1];
        arrangeArray(arrArrange,n1);
        printArray(arrArrange);
        System.out.println();

        int[] linearArr = {11, 1112, 21123, 6544, 1135};
        int n = 21123;
        System.out.println(linearSearch(linearArr,n));

        int[] larArr = {11, 1112, 21123, 6544, 1135};
        System.out.println(findLargest(larArr));

        int[] sumArr = {1, 2, 3, 4, 5};
        System.out.println(sumArray(sumArr));

        int[] findU = {1,4,2,3,3,2,1,1,2,3,5};
        System.out.println(findUnique(findU));

        int[] findD = {0,0};
        System.out.println(findDuplicate(findD));

        int[] pairs = {1,3,6,2,5,4,3,2,4};
        int x = 7;
        System.out.println(pairSum(pairs,x));

        int[] triplet = {1,2,3,4,5,6,7};
        int x2 = 12;
        System.out.println(findTriplet(triplet,x2));

        int[] zeroOne = {1,1,0,1,0,1,0,1};
        printArray(zeroOne);
        sortZeroesAndOne(zeroOne);
        System.out.println();
        printArray(zeroOne);
        System.out.println();

        int[] zeroOne2 = {1,1,0,1,0,1,0,1};
        printArray(zeroOne2);
        sortZeroesAndOne2(zeroOne2);
        System.out.println();
        printArray(zeroOne2);
        System.out.println();

        int [] array1 = {2,6,1,2};
        int [] array2 = {1,2,3,4,2};
        intersections(array1,array2);
//        int[] arrays = takeInput();
//        printArray(arrays);
    }
    public static void sortZeroesAndOne2(int[] arr) {
        int zero = 0;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                zero++;
            }
        }
    }
    public static void sortZeroesAndOne(int[] arr) {
       int s =0;
       int e = arr.length-1;
       while(s<e){
           if(arr[s]==0){
               s++;
           }
           else if(arr[e]==1){
               e--;
           }
           else {
               int temp = arr[s];
               arr[s] = arr[e];
               arr[e] = temp;
               s++;
               e--;
           }
       }
    }
    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int pairSum(int[] arr, int x) {
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void intersections(int[] arr1, int[] arr2 ){
        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (k == arr2[j]) {
                    System.out.print(k + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static int findDuplicate(int[] arr) {
        for(int i = 0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int findUnique(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j] && i!=j){
                    count++;
                }
            }
            if(count==0) {
                return arr[i];
            }
        }
        return -1;
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Array Size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "th element in array : ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void arrangeArray(int[] arr, int n){
        if(n%2==0){
            for(int i =0;i<n/2;i++){
                arr[i] = 2*i+1;
                arr[arr.length-1-i] = 2*i+2;
            }
        }
        else {
            for(int i = 0;i<=n/2;i++){
                arr[arr.length-1-i] = 2*i+2;
                arr[i] = 2*i+1;
            }
        }
    }
    public static void printAllPairs(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i;j<arr.length-1;j++){
                System.out.print("("+arr[i] +","+ arr[j+1]+")");
            }
            System.out.println();
        }
    }
    public static void swapAlternative(int[] arr){
        for (int i =0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
