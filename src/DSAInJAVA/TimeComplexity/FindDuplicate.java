package DSAInJAVA.TimeComplexity;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3, 4, 0, 5};
        System.out.println(findDuplicate(arr));
    }
    private static int findDuplicate(int[] arr) {
        int sumOfNMinusNaturalNumber = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumOfNMinusNaturalNumber += i;
        }
        int sumOfNNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfNNumber += arr[i];
        }
        return sumOfNNumber - sumOfNMinusNaturalNumber;
    }
}