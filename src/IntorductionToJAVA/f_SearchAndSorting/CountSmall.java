package IntorductionToJAVA.f_SearchAndSorting;

import IntorductionToJAVA.e_ArrayOne.TakeInputAndPrint;

public class CountSmall {
    public static void main(String[] args) {
        int [] arr1 = {4,5,6,7};
        int [] arr2 = {6,7};
        int answer[] = countSmall(arr1,arr2);
        TakeInputAndPrint.printArray(answer);

    }

    private static int[] countSmall(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int count =0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]>=arr2[j]){
                    count++;
                }
            }
            result[i] = count;
            count=0;
        }
        return result;
    }
}
