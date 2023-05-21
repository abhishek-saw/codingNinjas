package e_ArrayOne;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = TakeInputAndPrint.takeInput();
        int x = 5;
        int result = linearSearch(arr,x);
        System.out.print(result);
    }
    private static int linearSearch(int[] arr, int x) {
        int answer = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){;
                answer = i;
            }
        }
        return answer;
    }
}
