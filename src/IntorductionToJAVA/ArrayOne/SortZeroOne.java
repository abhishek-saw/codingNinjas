package IntorductionToJAVA.ArrayOne;

public class SortZeroOne {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        sortZeroOne(arr);
        TakeInputAndPrint.printArray(arr);
    }

    private static void sortZeroOne(int[] arr) {
//        bubbles sort
//        int zero=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                int temp = arr[zero];
//                arr[zero] = arr[i];
//                arr[i] = temp;
//                zero++;
//            }
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            if(arr[s]==0){
                s++;
            }
            else if(arr[e]==1){
                e--;
            }
            else if(arr[s]==1&&arr[e]==0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            else{
                s++;
                e--;
            }
        }
    }
}
