package IntorductionToJAVA.ArrayOne;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1 [] = {2,6,8,5,4,2,3};
        int arr2 [] = {2,3,4,7};
        int arr3 [] = {10,10};
        int arr4 [] = {10};
        int arr5 [] = {2,6,1,2};
        int arr6 [] = {1,2,3,4,2};
        intersectionOfTwoArrays(arr1,arr2);
        System.out.println();
        intersectionOfTwoArrays(arr3,arr4);
        System.out.println();
        intersectionOfTwoArrays(arr5,arr6);
    }

    private static void intersectionOfTwoArrays(int[] arr1, int[] arr2) {
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }
}
