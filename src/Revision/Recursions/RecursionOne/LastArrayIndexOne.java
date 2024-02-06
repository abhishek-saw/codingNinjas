package Revision.Recursions.RecursionOne;

public class LastArrayIndexOne {
    public static void main(String[] args) {
        int [] input = {1,2,23,4,23,2,2,32,34,4,554,2,3,2,2,3,4,2,3,2,2,3,4,2,2,267,6,5,43,4,3,5};
        int x = 355;
        System.out.println(input.length);
        System.out.println(lastIndex(input,x));
    }

    private static int lastIndex(int[] input, int x) {
        if(input.length==0){
            return -1;
        }
        if(input[input.length-1]==x){
            return input.length-1;
        }
        int [] smallArray = new int[input.length-1];
        System.arraycopy(input, 0, smallArray, 0, smallArray.length);
        return lastIndex(smallArray,x);
    }
}
