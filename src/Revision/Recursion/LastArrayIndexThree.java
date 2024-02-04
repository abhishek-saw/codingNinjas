package Revision.Recursion;

public class LastArrayIndexThree {
    public static void main(String[] args) {
        int [] input = {1,2,23,4,23,2,2,32,34,4,554,2,3,2,2,3,4,2,3,2,2,3,4,2,2,267,6,5,43,4,3,5};
        int x = 3;
        System.out.println(input.length);
        System.out.println(lastIndex(input,x,0));
    }

    private static int lastIndex(int[] input, int x, int si) {
        if(si==input.length){
            return -1;
        }
        int index = lastIndex(input,x,si+1);
        if(index!=-1){
            return index;
        }
        else {
            if(input[si]==x){
                return si;
            }
            else{
                return -1;
            }
        }
    }
}
