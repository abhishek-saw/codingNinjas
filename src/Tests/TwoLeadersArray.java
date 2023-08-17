package Tests;

public class TwoLeadersArray {
    public static void main(String[] args) {
        int[]arr = {13,17,5,4,6};
        int[]input = {3,12,34,2,0,-1};
        leadersArray(arr);
        System.out.println( );
        leadersArray(input);
    }
    private static void leadersArray(int[] arr) {
        for(int i=0; i<arr.length ; i++){
            boolean smaller = true;
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    smaller = false;
                    break;
                }
            }
            if(smaller){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
