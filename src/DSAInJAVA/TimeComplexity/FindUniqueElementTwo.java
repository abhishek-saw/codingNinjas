package DSAInJAVA.TimeComplexity;

public class FindUniqueElementTwo {
    public static void main(String[] args) {
        int[] arr = {1, 7, 1, 3, 7};
        System.out.println(findUniqueElement(arr));

    }

    private static int findUniqueElement(int[] arr) {
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            int s = arr[i];
            xor = xor^arr[i];
        }
        return xor;
    }
}