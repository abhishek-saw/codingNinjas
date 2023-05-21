package f_SearchAndSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        int target = 9;
        int result = binarySearch(nums,target);
        System.out.println(result);

    }
    private static int binarySearch(int[] nums,int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int m = (s + e) / 2;
            if (target == nums[m]) {
                return m;
            }
            else if (target > nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
