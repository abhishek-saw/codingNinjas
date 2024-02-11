package DSAInJAVA.Recursion.RecursionTwo;

public class BinarySearchR {
    public static void main(String[] args) {
        // Time Complexity : O(logn)
        int[] numb = {0, 1, 2, 3, 4, 5, 6};
        int target = 6;
        int result = binarySearch(numb, target, 0, numb.length - 1);
        System.out.println(result);
    }
    private static int binarySearch(int[] arr, int x, int s, int e) {
        int mid = (s + e) / 2;
        if (s > e) {
            return -1;
        }
        if (arr[mid] == x) {
            System.out.print("mid ");
            return mid;
        } else if (arr[mid] > x) {
            System.out.println("arr[mid] > x");
            return binarySearch(arr, x, s, mid - 1);
        } else {
            System.out.println("arr[mid] < x");
            return binarySearch(arr, x, mid + 1, e);
        }
    }
}

