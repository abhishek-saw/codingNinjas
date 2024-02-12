package DSAInJAVA.TimeComplexity;

import IntroductionToJAVA.ArrayOne.TakeInputAndPrint;

public class ArrayIntersectionTwo {
    public static void main(String[] args) {
        int [] arr1 = {6,9,5,8,2};
        int [] arr2 = {9,4,1,8};
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
        System.out.println();
        intersection(arr1,arr2);
    }

    private static void intersection(int[] arr1, int[] arr2) {
        //        Time Complexity : O(nlogm + nlogn)
        if(arr1.length==0 || arr2.length==0){
            return;
        }
        if(arr1.length<arr2.length){
            mergeSort(arr1);
            int i = 0;
            while(i<arr2.length){
                int m = binarySearch(arr1,arr2[i],0,arr1.length-1) ;
                if(m!=-1) {
                    System.out.print(arr2[i] + " ");
                }
                i++;
            }
        }
        else{
            mergeSort(arr2);
            int j =0;
            while(j<arr1.length){
                int n  = binarySearch(arr2,arr1[j],0,arr2.length-1);
                if(n!=-1) {
                    System.out.print(arr1[j] + " ");
                }
                j++;
            }
        }

    }

    private static int binarySearch(int[] arr1, int x, int s, int e) {
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr1[mid] == x){
            return mid;
        }
        else if(arr1[mid]>x){
            return binarySearch(arr1,x,s,mid-1);
        }
        else{
            return binarySearch(arr1,x,mid+1,e);
        }
    }

    public static void mergeSort(int[] arr) {
        if(arr.length==1){
            return;
        }
        int [] m = new int[arr.length/2];
        int [] n = new int[arr.length - m.length];

        System.arraycopy(arr, 0, m, 0, m.length);
        System.arraycopy(arr, m.length, n, 0, n.length);
        mergeSort(m);
        mergeSort(n);
        merged(m,n,arr);
    }
    private static void merged(int[] m, int[] n, int[] arr) {
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i<m.length && j<n.length){
            if(m[i]<n[j]){
                arr[k] = m[i];
                k++;
                i++;
            }
            else{
                arr[k] = n[j];
                k++;
                j++;
            }
        }
        while(i < m.length){
            arr[k] = m[i];
            k++;
            i++;
        }
        while (j < n.length) {
            arr[k] = n[j];
            k++;
            j++;
        }
    }
}
