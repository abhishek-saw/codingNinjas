package DSAInJAVA.Recursion.RecursionOne;

public class SumOfArrayOneR {
    public static int sum(int input[],int si) {
        if(si==input.length-1){
            return input[si];
        }
        return input[si]+sum(input,si+1);
    }
        public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        System.out.println(sum(arr,0));
    }
}
