package e_ArrayOne;

public class FindUnique {
    public static void main(String[] args) {
        int arr1[] = {2,4,7,2,7};

        int arr2[] = {1,3,1,3,6,6,7,10,7};
        int res1 = findUnique(arr1);
        int res2 = findUnique(arr2);
        System.out.print(res1);
        System.out.println();
        System.out.print(res2);
    }
    private static int findUnique(int[] arr) {
        int count = 0;
        int answer = 0;
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                answer = arr[i];
                break;
            }
            count=0;
        }
        return answer;
    }
}
