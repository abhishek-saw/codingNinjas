package DSAInJAVA.TimeComplexity;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4, 5};
        int num = 8;
        System.out.println(pairSum(arr, num));

    }

    private static int pairSum(int[] arr, int num) {
        if (arr.length == 0) {
            return 0;
        }
        mergedSort(arr, 0, arr.length - 1);
        int numPairs = 0;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            if (arr[leftIndex] + arr[rightIndex] > num) {
                rightIndex--;
            } else if (arr[leftIndex] + arr[rightIndex] < num) {
                leftIndex++;
            } else {
                int elementAtLeft = arr[leftIndex];
                int elementAtRight = arr[rightIndex];
                if (elementAtLeft == elementAtRight) { // may be adjacent for same numbers in between
                    int equalPairsCount = rightIndex - leftIndex + 1;
                    numPairs += (equalPairsCount) * (equalPairsCount - 1) / 2; // (n)(n-1)/2
                }
                int tempLeftIndex = leftIndex;
                int tempRightIndex = rightIndex;
                while (tempLeftIndex <= tempRightIndex && arr[tempLeftIndex] == elementAtLeft) {
                    tempLeftIndex++;
                }
                while (tempLeftIndex <= tempRightIndex && arr[tempRightIndex] == elementAtRight) {
                    tempRightIndex--;
                }
                int countSameLeft = tempLeftIndex - leftIndex;
                int countSameRight = rightIndex - tempRightIndex;
                numPairs += countSameRight * countSameLeft;
                leftIndex = tempLeftIndex;
                rightIndex = tempRightIndex;
            }
        }
        return numPairs;
    }
    public static void mergedSort(int[] arr, int s, int e) {
        if(arr.length==1){
            return;
        }
        int [] m = new int[(s+e)/2];
        int [] n = new int[arr.length - m.length];

        System.arraycopy(arr, 0, m, 0, m.length);
        System.arraycopy(arr, m.length, n, 0, n.length);
        mergedSort(m,0,m.length);
        mergedSort(n,0,n.length);
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

