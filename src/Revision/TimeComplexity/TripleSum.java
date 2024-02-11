package Revision.TimeComplexity;


public class TripleSum {
    public static void main(String[] args) {
        //TODO
        int[] arr = {6,1,1,4,6,5,3,2};
        int num = 6;
        System.out.println(tripleSum(arr, num));
    }
    private static int tripleSum(int[] arr, int num) {
        if(arr.length==0){
            return 0;
        }
        mergedSort(arr, 0, arr.length - 1);
        int n = arr.length;
        int numTriplets = 0;
        for (int i = 0; i < n; i++) {
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);
            numTriplets += numPairs;
        }
        return numTriplets;
    }
    private static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
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
                int tempEndIndex = endIndex - 1;
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
    public static void mergedSort ( int[] arr, int s, int e){
        if (arr.length == 1) {
            return;
        }
        int[] m = new int[(s + e) / 2];
        int[] n = new int[arr.length - m.length];

        System.arraycopy(arr, 0, m, 0, m.length);
        System.arraycopy(arr, m.length, n, 0, n.length);
        mergedSort(m, 0, m.length);
        mergedSort(n, 0, n.length);
        merged(m, n, arr);
    }
    private static void merged( int[] m, int[] n, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m.length && j < n.length) {
            if (m[i] < n[j]) {
                arr[k] = m[i];
                k++;
                i++;
            } else {
                arr[k] = n[j];
                k++;
                j++;
            }
        }
        while (i < m.length) {
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
