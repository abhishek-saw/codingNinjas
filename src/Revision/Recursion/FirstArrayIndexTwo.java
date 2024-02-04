package Revision.Recursion;

public class FirstArrayIndexTwo {
    public static void main(String[] args) {
        int [] input = {1,2,23,4,23,2,2,32,34,4,554,2,3,2,2,3,4,2,3,2,2,3,4,2,2,267,6,5,43,4,3,5};
        int x = 3;
        int si = 0;
        System.out.println(input.length);
        System.out.println(firstIndex(input,x,si));
    }

    private static int firstIndex(int[] input, int x, int si) {
        if(input.length==si){
            return -1;
        }
        if(input[si]==x){
            return si;
        }
        return firstIndex(input,x, si+1);
    }
}
