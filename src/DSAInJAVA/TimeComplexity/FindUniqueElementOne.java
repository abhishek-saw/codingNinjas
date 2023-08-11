package DSAInJAVA.TimeComplexity;

public class FindUniqueElementOne{
    public static void main(String[] args) {
        int [] arr = {2,4,7,2,7,9,3,4,5,5};
        int [] arr2 = {1,7,1,3,7};
        System.out.println(findUniqueElement(arr));
        System.out.println(findUniqueElement(arr2));

    }

    private static int findUniqueElement(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        if(arr.length==1){
            return arr[0];
        }
        mergeSortArray(arr, 0, arr.length);
        int unique = -1;
        int i = 1;
        while (i < arr.length) {
            if (arr[i - 1] == arr[i]) {
                i+=1;
            }
            else{
                unique = arr[i];
                i+=2;
            }
        }
        return unique;
    }
    public static void mergeSortArray(int[] arr, int s, int e) {
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
        mergeSortArray(m,0,m.length);
        mergeSortArray(n,0,n.length);
        mergedArray(m,n,arr);
    }
    private static void mergedArray(int[] m, int[] n, int[] arr) {
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
