package DSAInJAVA.TimeComplexity;

public class PairSum {
    public static void main(String[] args) {
        int arr [] = {1,3,6,2,5,4,3,2,4};
        int num = 7;
        System.out.println(pairSum(arr,num));

    }
    private static int pairSum(int[] arr, int num) {
        if(arr.length==0){
            return 0;
        }
        mergedSort(arr,0,arr.length-1);
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

        public static void mergedSort(int[] arr, int s, int e) {
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

