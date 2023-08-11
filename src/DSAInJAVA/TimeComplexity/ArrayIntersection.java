package DSAInJAVA.TimeComplexity;

import IntorductionToJAVA.ArrayOne.TakeInputAndPrint;

public class ArrayIntersection {
    public static void main(String[] args) {
        int [] arr1 = {1,1,2,2,3};
        int [] arr2 = {1,2,2,3,3};
        intersection(arr1,arr2);
        System.out.println();
        TakeInputAndPrint.printArray(arr1);
        System.out.println();
        TakeInputAndPrint.printArray(arr2);
    }
    private static void intersection(int[] arr1, int[] arr2) {
        mergeSort(arr1,0,arr1.length-1);
        mergeSort(arr2,0,arr2.length-1);
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i< arr1.length && j < arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static void mergeSort(int[] arr, int s, int e) {
        if(arr.length==1){
            return;
        }
        int [] m = new int[(s+e)/2];
        int [] n = new int[arr.length - m.length];

        for(int i=0;i<m.length;i++){
            m[i] = arr[i];
        }
        for(int j=0;j<n.length;j++){
            n[j] = arr[j+m.length];
        }
        mergeSort(m,0,m.length);
        mergeSort(n,0,n.length);
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
        while(i<m.length){
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
