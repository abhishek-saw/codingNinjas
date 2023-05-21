package e_ArrayOne;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr1[] = {2,4,1,2,7};

        int arr2[] = {1,4,1,3,5,6,9,10,7};
        int res1 = findDuplicate(arr1);
        int res2 = findDuplicate(arr2);
        System.out.print(res1);
        System.out.println();
        System.out.print(res2);
    }
    private static int findDuplicate(int[] arr) {
        int answer =   Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return arr[i];
                }
            }
        }
        return answer;
    }
}
