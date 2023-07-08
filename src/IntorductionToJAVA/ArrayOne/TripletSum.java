package IntorductionToJAVA.ArrayOne;

public class TripletSum {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6,7};
        int sum1 = 19;
        int arr2 [] = {2,-5,8,-6,0,5,10,11,-3};
        int sum2 = 10;
        int ans1 = tripletSum(arr1,sum1);
        int ans2 = tripletSum(arr2,sum2);
        System.out.println(ans1);
        System.out.println(ans2);

    }
    private static int tripletSum(int[] arr, int x) {
        int count =0;
        for(int i =0;i< arr.length-2;i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
