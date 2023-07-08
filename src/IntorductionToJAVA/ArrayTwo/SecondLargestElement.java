package IntorductionToJAVA.ArrayTwo;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {90,8,98,5};
        int answer = secondLargestElement(arr);
        System.out.println(answer);
    }
    private static int secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                    secondLargest = largest;
                    largest = arr[i];
                }
            else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
