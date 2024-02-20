package DSAInJAVA.TimeComplexity;


public class TripleSum {
    public static void main(String[] args) {
        //TODO
        int[] arr = {6,1,6,5,3,2,5,0,5,6,0};
        int num = 5;
        System.out.println(tripleSum(arr, num));
    }
    private static int tripleSum(int[] arr, int num) {
        if(arr.length==0){
            return 0;
        }
        mergedSort(arr, 0, arr.length - 1);
        int numTriplets = 0;
        for(int i =0;i<arr.length;i++){
            int pairSumFor = num-arr[i];
            int count = pairSum(arr,(i+1),(arr.length-1),pairSumFor);
            numTriplets+=count;
        }
        return numTriplets;
    }
    private static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
        if (arr.length == 0) {
            return 0;
        }
        int numPairs = 0;
        int left = startIndex;
        int right = endIndex;
        while (left < right) {
            if (arr[left] + arr[right] > num) {
                right--;
            } else if (arr[left] + arr[right] < num) {
                left++;
            } else {
                int leftElement = arr[left];
                int rightElement = arr[right];
                if (leftElement == rightElement) {
                    int countPairs = (right - left) + 1;
                    numPairs += (countPairs * (countPairs - 1) / 2);
                    return numPairs;
                }
                int tempLeft = left;
                int tempRight = right;
                while (tempLeft <= tempRight && arr[tempLeft] == leftElement) {
                    tempLeft++;
                }
                while (tempRight >= tempLeft && arr[tempRight] == rightElement) {
                    tempRight--;
                }
                int countLeft = tempLeft - left;
                int countRight = right - tempRight;
                numPairs += (countLeft * countRight);
                left = tempLeft;
                right = tempRight;
            }
        }
        return numPairs;
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
