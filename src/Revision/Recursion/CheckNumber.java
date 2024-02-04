package Revision.Recursion;

public class CheckNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,7,4};
        int x = 12;
        System.out.println(checkNumber(arr,x));
    }

    private static boolean checkNumber(int[] input, int x) {
        if(input.length==0){
            return false;
        }
        if(input[0]==x){
            return true;
        }
        int [] smallArray = new int[input.length-1];
        for(int i =0;i<smallArray.length;i++){
            smallArray[i] = input[i+1];
        }
        return checkNumber(smallArray,x);
    }
}
