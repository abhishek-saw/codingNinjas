package Revision.Recursions.RecursionOne;

public class FirstArrayIndexOne {
    public static void main(String[] args) {
        int [] input = {1,2,23,4,23,2,2,32,34,4,554,2,3,2,2,3,4,2,3,2,2,3,4,2,2,267,6,5,43,4,3,5};
        int x = 3;
        System.out.println(input.length);
        System.out.println(firstIndex(input,x));
    }

    private static int firstIndex(int[] input, int x) {
        if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }
        int [] smallArray = new int[input.length-1];
        System.arraycopy(input, 1, smallArray, 0, smallArray.length);
        int index = firstIndex(smallArray,x);
        if(index ==-1){
            return -1;
        }
        else {
            return 1 + index;
        }
    }
}
