package Revision.TimeComplexity;


import static Revision.Arrays.ArrayOne.printArray;

public class FindUniqueOne {
    public static void main(String[] args) {
        int[] arr = {6,3,7,5,1,3,5,1,7,9,6};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        mergeSort(arr);
        printArray(arr);
        int i=1;
        int unique=-1;
        while(i<arr.length){
            if(arr[i-1]==arr[i]){
                i+=1;
            }
            else{
                unique = arr[i];
                i+=2;
            }
        }
        return unique;
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
