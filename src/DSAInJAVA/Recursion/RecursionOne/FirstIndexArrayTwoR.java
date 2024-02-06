package DSAInJAVA.Recursion.RecursionOne;

public class FirstIndexArrayTwoR {
    public static int firstIndex(int input[], int x,int si) {
        if(input.length==si){
            return -1;
        }
        if(input[si]==x){
            return si;
        }
        return firstIndex(input,x,si+1);
    }
        public static void main(String[] args) {
            int [] arr = {1,3,3,4,4,6,4};
            System.out.println(firstIndex(arr,6,0));
    }
}
