package Revision.TimeComplexity;


public class PairSum {
    public static void main(String[] args) {
        //TODO
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int num = 7;
        System.out.println(pairSum(arr,num));
    }

    private static int pairSum(int[] arr, int num) {
        if(arr.length==0){
            return 0;
        }
        mergeSorting(arr);
        int startIndex = 0;
        int endIndex = (arr. length - 1);
        int numPair = 0;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            } else {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                if (elementAtStart == elementAtEnd) {
                    int totalElementsFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd - 1) / 2);
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex;
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex += 1;
                }
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex -= 1;
                }
                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);
                numPair += (totalElementsFromStart * totalElementsFromEnd);
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }

    private static void mergeSorting(int[] arr) {
        if(arr.length==1){
            return;
        }
        int [] m = new int[arr.length/2];
        int [] n = new int[arr.length-m.length];

        System.arraycopy(arr,0,m,0,m.length);
        System.arraycopy(arr,m.length,n,0,n.length);
        mergeSorting(m);
        mergeSorting(n);
        merged(arr, m, n);
    }
    private static void merged(int[] arr, int[] m, int[] n) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m.length && j<n.length){
            if(m[i]<n[j]){
                arr[k] = m[i];
                i++;
            }
            else {
                arr[k] = n[j];
                j++;
            }
            k++;
        }
        while(i<m.length){
            arr[k] = m[i];
            i++;
            k++;
        }
        while(j<n.length){
            arr[k] = n[j];
            j++;
            k++;
        }
    }
}
