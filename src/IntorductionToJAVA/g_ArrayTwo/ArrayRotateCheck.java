package IntorductionToJAVA.g_ArrayTwo;

public class ArrayRotateCheck {
    public static void main(String[] args) {
        int arr1[] = {5,6,1,2,3,4};
        int answer1 = arrayRotateCheck(arr1);
        System.out.println(answer1);
        int arr2[] = {10,20,30,1};
        int answer2 = arrayRotateCheck(arr2);
        System.out.println(answer2);
        int arr3[] = {};
        int answer3 = arrayRotateCheck(arr3);
        System.out.println(answer3);
    }

    private static int arrayRotateCheck(int[] arr) {
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                   return i+1;
                }
            }
            return 0;
    }
}
