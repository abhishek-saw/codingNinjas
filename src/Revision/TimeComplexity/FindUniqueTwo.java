package Revision.TimeComplexity;

public class FindUniqueTwo {
    public static void main(String[] args) {
        int[] arr = {6,3,7,5,1,3,5,1,7,9,6};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique = 0;
        for(int i =0;i<arr.length;i++){
            unique ^= arr[i];
        }
        return unique;
    }
}
