package Revision.Arrays;

import static Revision.Arrays.ArrayOne.printArray;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int n1 = 3;
        int n2 = 9;
        System.out.println(binarySearch(arr1,n1));
        System.out.println(binarySearch(arr1,n2));

        int[] arr2 = {21,12,23,431,35,16,27};
        System.out.println("Selection Sort");
        printArray(arr2);
        selectionSort(arr2);
        System.out.println();
        printArray(arr2);
        System.out.println();

        int[] arr3 = {121,2212,1223,431,335,136,27};
        System.out.println("Bubble Sort");
        printArray(arr3);
        bubbleSort(arr3);
        System.out.println();
        printArray(arr3);
        System.out.println();

        int[] arr4 = {121,12,23,41,35,36,2};
        System.out.println("Insertion Sort");
        printArray(arr4);
        insertionSort(arr4);
        System.out.println();
        printArray(arr4);
        System.out.println();

        int [] merArr1 = {1,3,4,7,11};
        int [] merArr2 = {2,4,6,13};
        int [] ans = merge(merArr1,merArr2);
        printArray(ans);
        System.out.println();

        int[] sortArr = {2,1,0,1,2,0};
        printArray(sortArr);
        sort012(sortArr);
        System.out.println();
        printArray(sortArr);
        System.out.println();

        int[] sortArr1 = {2 ,2,1,1,2,1,0,0,1,2,2};
        printArray(sortArr1);
        sort012(sortArr1);
        System.out.println();
        printArray(sortArr1);
        System.out.println();

        int [] a = {3,2,1,7};
        int [] b = {3,4};
        int [] counts = countS(a.length,b.length,a,b);
        printArray(counts);
        System.out.println();

        int [] a1 = {10,20,30};
        int [] b1 = {17,15};
        System.out.println(smallestDifferencePair(a1,a1.length,b1,b1.length));
    }
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        int small = Integer.MAX_VALUE;
        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                int x = Math.abs(arr1[i] - arr2[j]);
                if(x<small) {
                    small = x;
                }
            }
        }
        return small;
    }
    public static int[] countS(int n, int m, int []a, int []b) {
        int [] counts = new int[n];
        for(int i =0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<m;j++){
                if(a[i]>=b[j]){
                    cnt++;
                }
                counts[i] = cnt;
            }
        }
        return counts;
    }
    public static void sort012(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int index = 0;
       while(s<e){
          if(arr[s]==0){
               int temp = arr[s];
               arr[s] = arr[index];
               arr[index] = temp;
               s++;
               index++;
           }
           else if(arr[s]==2){
               int temp = arr[e];
               arr[e] = arr[s];
               arr[s] = temp;
               e--;
           }
           else {
               s++;
           }
       }
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int [] ans = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
               ans[k] = arr2[j];
               k++;
               j++;
            }
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void insertionSort(int[] arr) {
        for(int i =1 ;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i =0;i<arr.length-1;i++){
            for (int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int [] arr){
        for (int i = 0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static int binarySearch(int[] arr1, int n) {
        int s = 0;
        int e = arr1.length-1;
        while (s<=e){
            int mid = (s+e)/2;
            if (arr1[mid]==n) return mid;
            else if(arr1[mid]>n) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
}
